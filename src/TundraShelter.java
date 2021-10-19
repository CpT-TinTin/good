public class TundraShelter extends shelter{
    private String watertype="Cool eutrophic";
    private String Climate="Polar";
    public TundraShelter(String id, int volume, boolean availability) {
        super(id, volume, availability);
    }

    @Override
    public String getWaterType() {
        return watertype;
    }

    @Override
    public int getLandsurface() {
        return 0;
    }
    public String getName(){
        return "Tundra";
    }

    @Override
    public int getCoraltypes() {
        return 0;
    }


    @Override
    public String getClimate() {
        return Climate;
    }
}
