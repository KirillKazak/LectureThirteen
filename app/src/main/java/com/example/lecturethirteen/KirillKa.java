package com.example.lecturethirteen;

import androidx.annotation.NonNull;

public class KirillKa implements Cloneable {
    String name;
    int age;

    public KirillKa(String name, int age) {
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "KirillKa{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @NonNull
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
