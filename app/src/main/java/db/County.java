package db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {

    private  int id;
    private  String CountyNname;
    private  String weatherId;
    private  int cityId;

    public String getCountyNname() {
        return CountyNname;
    }

    public void setCountyNname(String countyNname) {
        CountyNname = countyNname;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
