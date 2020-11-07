/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

with windows CTRL+ALT+SHIFT+e for setters and getters
 */
package models;

/**
 *
 * @author admin
 */
public class Models {
  private String ipaddress;
  private String urladdress;
  private int portnumber;
  private int cycle;
  private boolean url_Selected;
  private boolean ip_Selected;
  

    /**
     * @return the ipaddress
     */
    public String getIpaddress() {
        return ipaddress;
    }

    /**
     * @param ipaddress the ipaddress to set
     */
    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    /**
     * @return the urladdress
     */
    public String getUrladdress() {
        return urladdress;
    }

    /**
     * @param urladdress the urladdress to set
     */
    public void setUrladdress(String urladdress) {
        this.urladdress = urladdress;
    }

    /**
     * @return the ip_url_Selected
     */
    public boolean isurl_Selected() {
        return isUrl_Selected();
    }

    /**
     * @param url_Selected the url_Selected to set
     */
    public void seturl_Selected(boolean url_Selected) {
        this.setUrl_Selected(url_Selected);
    }

    /**
     * @return the url_Selected
     */
    public boolean isUrl_Selected() {
        return url_Selected;
    }

    /**
     * @param url_Selected the url_Selected to set
     */
    public void setUrl_Selected(boolean url_Selected) {
        this.url_Selected = url_Selected;
    }

    /**
     * @return the ip_Selected
     */
    public boolean isIp_Selected() {
        return ip_Selected;
    }

    /**
     * @param ip_Selected the ip_Selected to set
     */
    public void setIp_Selected(boolean ip_Selected) {
        this.ip_Selected = ip_Selected;
    }

    /**
     * @return the portnumber
     */
    public int getPortnumber() {
        return portnumber;
    }

    /**
     * @param portnumber the portnumber to set
     */
    public void setPortnumber(int portnumber) {
        this.portnumber = portnumber;
    }

    /**
     * @return the cycle
     */
    public int getCycle() {
        return cycle;
    }

    /**
     * @param cycle the cycle to set
     */
    public void setCycle(int cycle) {
        this.cycle = cycle;
    }
    
  
}
