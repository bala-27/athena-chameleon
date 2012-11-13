/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Revision History
 * Author			Date				Description
 * ---------------	----------------	------------
 * Hyo-jeong Lee	2012. 9. 13.		First Draft.
 */
package com.athena.chameleon.engine.entity.provisioning;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * This Genre class is a Value Object class for JBoss Instance.
 * 
 * @author Hyo-jeong Lee
 * @version 1.0
 */
public class JBossInstance implements Serializable {

    private static final long serialVersionUID = 1L;
    
    //Server IP
    private String serverIp;
    //Server Port
    private String serverPort;
    //JBoss Engine Home
    private String engineHome;
    //신규설치 여부
    private String newInstallYn;
    //JBoss Server Home
    private String serverHome;
    //JBoss Server Name
    private String serverName;
    //Port Group
    private String portGroup;
    //SSH-Login-Id
    private String sshLoginId;
    //SSH-Login-password
    private String sshLoginPassword;

    /**
     * @return the serverIp
     */
    public String getServerIp() {
        return serverIp;
    }

    /**
     * @param serverIp the serverIp to set
     */
    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    /**
     * @return the serverPort
     */
    public String getServerPort() {
        return serverPort;
    }

    /**
     * @param serverPort the serverPort to set
     */
    public void setServerPort(String serverPort) {
        this.serverPort = serverPort;
    }

    /**
     * @return the engineHome
     */
    public String getEngineHome() {
        return engineHome;
    }

    /**
     * @param engineHome the engineHome to set
     */
    public void setEngineHome(String engineHome) {
        this.engineHome = engineHome;
    }

    /**
     * @return the serverHome
     */
    public String getServerHome() {
        return serverHome;
    }

    /**
     * @param serverHome the serverHome to set
     */
    public void setServerHome(String serverHome) {
        this.serverHome = serverHome;
    }

    /**
     * @return the newInstallYn
     */
    public String getNewInstallYn() {
        return newInstallYn;
    }

    /**
     * @param newInstallYn the newInstallYn to set
     */
    public void setNewInstallYn(String newInstallYn) {
        this.newInstallYn = newInstallYn;
    }

    /**
     * @return the serverName
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * @param serverName the serverName to set
     */
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * @return the portGroup
     */
    public String getPortGroup() {
        return portGroup;
    }

    /**
     * @param portGroup the portGroup to set
     */
    public void setPortGroup(String portGroup) {
        this.portGroup = portGroup;
    }

	/**
	 * @return the sshLoginId
	 */
	public String getSshLoginId() {
		return sshLoginId;
	}

	/**
	 * @param sshLoginId the sshLoginId to set
	 */
	public void setSshLoginId(String sshLoginId) {
		this.sshLoginId = sshLoginId;
	}

	/**
	 * @return the sshLoginPassword
	 */
	public String getSshLoginPassword() {
		return sshLoginPassword;
	}

	/**
	 * @param sshLoginPassword the sshLoginPassword to set
	 */
	public void setSshLoginPassword(String sshLoginPassword) {
		this.sshLoginPassword = sshLoginPassword;
	}

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

}
