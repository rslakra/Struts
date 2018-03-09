package roseindia.net.dao.hibernate;

import java.io.Serializable;


public class Tutorial implements Serializable {

    /** identifier field */
    private Integer id;

    /** persistent field */
    private String shortdesc;

    /** persistent field */
    private String longdesc;

    /** persistent field */
    private String pageurl;

    /** full constructor */
    public Tutorial(Integer id, String shortdesc, String longdesc, String pageurl) {
        this.id = id;
        this.shortdesc = shortdesc;
        this.longdesc = longdesc;
        this.pageurl = pageurl;
    }

    /** default constructor */
    public Tutorial() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShortdesc() {
        return this.shortdesc;
    }

    public void setShortdesc(String shortdesc) {
        this.shortdesc = shortdesc;
    }

    public String getLongdesc() {
        return this.longdesc;
    }

    public void setLongdesc(String longdesc) {
        this.longdesc = longdesc;
    }

    public String getPageurl() {
        return this.pageurl;
    }

    public void setPageurl(String pageurl) {
        this.pageurl = pageurl;
    }

}
