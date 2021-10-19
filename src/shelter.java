public abstract class shelter {
    protected String id;
    protected int volume;
    protected boolean availability;
    public shelter(String id,int volume, boolean availability){
        this.id=id;
        this.volume=volume;
        this.availability=availability;
    }
    public abstract String getWaterType();
    public abstract int getLandsurface();
    public abstract String getClimate();
    public abstract String getName();
    public abstract int getCoraltypes();
}
