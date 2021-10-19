public class ReefShelter extends shelter{
    private int coraltypes;
    private String watertype="Warm Trophic”";
    private String Climate="Tropical";
    public ReefShelter(String id, int volume, boolean availability,int coraltypes) {
        super(id, volume, availability);
        this.coraltypes=coraltypes;
    }

    @Override
    public String getWaterType() {
        return watertype;
    }

    @Override
    public int getLandsurface() {
        return 0;
    }
    @Override
    public int getCoraltypes(){
        return coraltypes;
    }

    @Override
    public String getClimate() {
        return Climate;
    }

    @Override
    public String getName() {
        return "Reef";
    }
}
