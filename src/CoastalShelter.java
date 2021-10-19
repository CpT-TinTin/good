public class CoastalShelter extends shelter{
    private int landsurface;
    private String watertype="Cool eutrophic";
    private String Climate="Temperate";
    public CoastalShelter(String id, int volume, boolean availability,int landsurface) {
        super(id, volume, availability);
        this.landsurface=landsurface;

    }
    public int getLandsurface() {
        return landsurface;
    }

public String getName(){
        return "Coastal";
}

    @Override
    public int getCoraltypes() {
        return 0;
    }

    public String getClimate() {
        return Climate;
    }


    @Override
    public String getWaterType() {
        return watertype;
    }
}

