package com.example.demo.service.otherService;

public class Other2Impl implements Other2{
    private Other1 other1;

    public Other2Impl(Other1 other1) {
        other1=other1;
        System.out.println(other1.service());
    }

    public String service() {
        return other1.service();
    }
}
