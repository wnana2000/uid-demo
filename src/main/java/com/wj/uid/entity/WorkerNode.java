package com.wj.uid.entity;


import java.time.LocalDate;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * DB WorkerID Assigner for UID Generator
 * </p>
 *
 * @author huzhiting
 * @since 2020-04-23
 */

public class WorkerNode implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * auto increment id
     */
    private Long id;

    /**
     * host name
     */
    private String hostName;

    /**
     * port
     */
    private String port;

    /**
     * node type: ACTUAL or CONTAINER
     */
    private Integer type;

    /**
     * launch date
     */
    private LocalDate launchDate;

    /**
     * modified time
     */
    private LocalDateTime modified;

    /**
     * created time
     */
    private LocalDateTime created;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public LocalDate getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(LocalDate launchDate) {
        this.launchDate = launchDate;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }
    
    
    
}
