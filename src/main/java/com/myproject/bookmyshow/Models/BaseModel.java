package com.myproject.bookmyshow.Models;

import lombok.Getter;
import lombok.Setter;

import javax.xml.crypto.Data;
import java.util.Date;
@Getter
@Setter
public class BaseModel {
    private Long id;
    private Date createdAt;
    private Date modifiedAt;
}
