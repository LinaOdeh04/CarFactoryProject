package factory;

public class BasicCar implements ICar{


        private String name;
        private String description;
        private ChassisSize size;
        private Region region;

        public BasicCar(String name, String description,
                        ChassisSize size, Region region) {

            this.name = name;
            this.description = description;
            this.size = size;
            this.region = region;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public String getDescription() {
            return name + " - " + description;
        }

        @Override
        public ChassisSize getSize() {
            return size;
        }

        @Override
        public Region getRegion() {
            return region;
        }


    @Override
    public void formSize() {

        String layout = "";

        switch (size) {

            case COMPACT:
                switch (region) {
                    case CHINA:
                        layout = "Compact short-wheelbase structure for China market.";
                        break;

                    case MIDDLE_EAST:
                        layout = "Compact reinforced cooling structure for Middle East market.";
                        break;

                    case ASIA:
                        layout = "Compact lightweight structure for Asia market.";
                        break;
                }
                break;

            case MIDSIZE:
                switch (region) {
                    case CHINA:
                        layout = "Midsize balanced chassis structure for China market.";
                        break;

                    case MIDDLE_EAST:
                        layout = "Midsize reinforced chassis structure for Middle East market.";
                        break;

                    case ASIA:
                        layout = "Midsize fuel-efficient chassis structure for Asia market.";
                        break;
                }
                break;

            case FULLSIZE:
                switch (region) {
                    case CHINA:
                        layout = "Fullsize extended chassis structure for China market.";
                        break;

                    case MIDDLE_EAST:
                        layout = "Fullsize heavy-duty chassis structure for Middle East market.";
                        break;

                    case ASIA:
                        layout = "Fullsize spacious chassis structure for Asia market.";
                        break;
                }
                break;
        }

        System.out.println("Manufacturing Structural Layout:");
        System.out.println(layout);
    }



}



