package com.chernogorov.config;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataSourceProperties {

    private String driverClassName;
    private String url;
    private String username;
    private String password;
    private String connectionTestQuery;
    private String poolName;
    private long connectionTimeout;
    private long idleTimeout;
    private long validationTimeout;
    private int maximumPoolSize;
    private int minimumIdle;
    private boolean autoCommit;

}
