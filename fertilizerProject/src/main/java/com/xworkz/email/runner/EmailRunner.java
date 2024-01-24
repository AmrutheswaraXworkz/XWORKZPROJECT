package com.xworkz.email.runner;

import com.xworkz.email.entity.EmailEntity;
import com.xworkz.email.repository.EmailRepo;
import com.xworkz.email.repository.EmailRepoImpl;

public class EmailRunner {
    public static void main(String[] args) {
        EmailEntity email=new EmailEntity(1,"amruth@gmail.com","amruth@gmail.com","xworkz@gmail.com","Leave","2024-01-24",true);
        EmailRepo er=new EmailRepoImpl();
        er.saveDetails(email);
    }
}
