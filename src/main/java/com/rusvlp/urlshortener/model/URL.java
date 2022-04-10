package com.rusvlp.urlshortener.model;

import java.util.Deque;
import java.util.LinkedList;
import java.util.zip.CRC32;

public class URL{
    private String url;
    CRC32 crc = new CRC32();

    public URL(String url){
        this.setUrl(url);
    }

    public String getUrl() {
        return url;
    }

    private void setUrl(String url) {
        this.url = url;
        crc.update(this.url.getBytes());
    }

    public String compress(){
        long num = this.crc.getValue() ;
        Deque<Long> lst = new LinkedList<>();

        for (long i = num; i > 0; i = i / 56){
            //System.out.print(i%2);
            lst.push(i%56);
        }

        String compr = "";
        int sz = lst.size();
        for (int i = 0; i< sz; i++){
            long tmp = lst.pop();
            if (tmp >= 0 && tmp <=9)
                compr += tmp;
            if (tmp >=10 && tmp <= 33)
                compr += (char) (64 + tmp-10);
            if (tmp > 33 && tmp <=56)
                compr += (char) (97 + tmp-(10+23));
        }


        return compr;
    }

    @Override
    public int hashCode(){
        return (int)this.crc.getValue();
    }

    @Override
    public boolean equals(Object o){
        if (o == null)
            return false;

        if (o.getClass() != this.getClass())
            return false;

        URL toCompare = (URL)o;
        if (this.url.equals(toCompare.url))
            return true;

        return false;

    }


}
