package com.xworkz.email.repository;

import com.xworkz.email.entity.EmailEntity;

public interface EmailRepo {

    Integer saveDetails(EmailEntity email);
}
