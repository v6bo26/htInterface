package project;
public class App {
    public class Plant{
        public int Weigth;
        public String Color;
        public String Maturity;
        public String Condition;
        public String Peeling;

        public Plant(int Weigth, String Color, String Maturity, String Condition, String Peeling) {
            this.Weigth = Weigth;
            this.Color = Color;
            this.Maturity = Maturity;
            this.Condition = Condition;
            this.Peeling = Peeling;
        }

        public int getWeigth() {
            return Weigth;
        }

        public void setWeigth(int Weigth) {
            this.Weigth = Weigth;
        }

        public String getColor() {
            return Color;
        }

        public void setColor(String Color) {
            this.Color = Color;
        }

        public String getMaturity() {
            return Maturity;
        }

        public void setMaturity(String Maturity) {
            this.Maturity = Maturity;
        }

        public String getCondition() {
            return Condition;
        }

        public void setCondition(String Condition) {
            this.Condition = Condition;
        }

        public String getPeeling() {
            return Peeling;
        }

        public void setPeeling(String Peeling) {
            this.Peeling = Peeling;
        }

        @Override
        public String toString() {
            return super.toString(); //To change body of generated methods, choose Tools | Templates.
        }
    }
}