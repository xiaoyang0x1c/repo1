package com.lagou.pojo;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author xiaoyang
 * @date 2023/4/8
 * @program springmvc
 */
@Data
public class QueryVo {
    private String keyword;
    private User user;
    private List<User> userList;
    private Map<String,User> userMap;
}
