/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab14;

/**
 *
 * @author sethp
 */
public class Material {

    private final String texture;
    private final String weight;
    private final String opacity;
    private final String structure;
    private final String breathable;
    private final String waterproof;
    private final String absorbent;
    private final String windproof;
    private final String moistureResist;
    private final String shiny;
    private final String antibacterial;
    private final String heatResist;
    private final String coldResist;
    private final String acidResist;
    private final String alcoholResist;
    private final String alkaliResist;
    private final String mineralOilResist;
    private final String recyclable;

    private Material(Builder builder) {
        texture = builder.texture;
        weight = builder.weight;
        opacity = builder.opacity;
        structure = builder.structure;
        breathable = builder.breathable;
        waterproof = builder.waterproof;
        absorbent = builder.absorbent;
        windproof = builder.windproof;
        moistureResist = builder.moistureResist;
        shiny = builder.shiny;
        antibacterial = builder.antibacterial;
        heatResist = builder.heatResist;
        coldResist = builder.coldResist;
        acidResist = builder.acidResist;
        alcoholResist = builder.alcoholResist;
        alkaliResist = builder.alkaliResist;
        mineralOilResist = builder.mineralOilResist;
        recyclable = builder.recyclable;
    }

    @Override
    public String toString() {
        String string = "Material:\ntexture=" + texture
                + "\nweight=" + weight
                + "\nopacity=" + opacity
                + "\nstructure=" + structure
                + "\nbreathable=" + breathable;
        if (waterproof != null) {
            string += "\nwaterproof=" + waterproof;
        }
        if (absorbent != null) {
            string += "\nabsorbent=" + absorbent;
        }
        if (moistureResist != null) {
            string += "\nmoistureResist=" + moistureResist;
        }
        if (shiny != null) {
            string += "\nshiny=" + shiny;
        }
        if (antibacterial != null) {
            string += "\nantibacterial=" + antibacterial;
        }

        if (heatResist != null) {
            string += "\nheatResist=" + heatResist;
        }
        if (coldResist != null) {
            string += "\ncoldResist=" + coldResist;
        }
        if (acidResist != null) {
            string += "\nacidResist=" + acidResist;
        }
        if (alcoholResist != null) {
            string += "\nalcoholResist=" + alcoholResist;
        }
        if (alkaliResist != null) {
            string += "\nalkaliResist=" + alkaliResist;
        }
        if (mineralOilResist != null) {
            string += "\nmineralOilResist=" + mineralOilResist;
        }
        if (recyclable != null) {
            string += "\nrecyclable=" + recyclable;
        }

        return string;
    }

    public static class Builder {

        private final String texture;
        private final String weight;
        private final String opacity;
        private final String structure;
        private final String breathable;
        private String waterproof;
        private String absorbent;
        private String windproof;
        private String moistureResist;
        private String shiny;
        private String antibacterial;
        private String heatResist;
        private String coldResist;
        private String acidResist;
        private String alcoholResist;
        private String alkaliResist;
        private String mineralOilResist;
        private String recyclable;

        public Builder(Texture texture, Weight weight, Opacity opacity, Structure structure, Breathable breathable) {
            this.texture = texture.val;
            this.weight = weight.val;
            this.opacity = opacity.val;
            this.structure = structure.val;
            this.breathable = breathable.val;
        }

        public Builder waterproof(boolean val) {
            this.waterproof = val ? "Yes" : "No";
            return this;
        }

        public Builder absorbent(boolean val) {
            this.absorbent = val ? "Yes" : "No";
            return this;
        }

        public Builder windproof(boolean val) {
            this.windproof = val ? "Yes" : "No";
            return this;
        }

        public Builder moistureResist(boolean val) {
            this.moistureResist = val ? "Yes" : "No";
            return this;
        }

        public Builder shiny(boolean val) {
            this.shiny = val ? "Yes" : "No";
            return this;
        }

        public Builder antibacterial(boolean val) {
            this.antibacterial = val ? "Yes" : "No";
            return this;
        }

        public Builder heatResist(boolean val) {
            this.heatResist = val ? "Yes" : "No";
            return this;
        }

        public Builder coldResist(boolean val) {
            this.coldResist = val ? "Yes" : "No";
            return this;
        }

        public Builder acidResist(boolean val) {
            this.acidResist = val ? "Yes" : "No";
            return this;
        }

        public Builder alcoholResist(boolean val) {
            this.acidResist = val ? "Yes" : "No";
            return this;
        }

        public Builder alkaliResist(boolean val) {
            this.acidResist = val ? "Yes" : "No";
            return this;
        }

        public Builder mineralOilResist(boolean val) {
            this.mineralOilResist = val ? "Yes" : "No";
            return this;
        }

        public Builder recyclable(boolean val) {
            this.recyclable = val ? "Yes" : "No";
            return this;
        }

        public Material build() {
            return new Material(this);
        }

        enum Texture {
            SOFT("Soft"), HARD("Hard");
            String val;

            Texture(String val) {
                this.val = val;
            }

        }

        enum Weight {
            LIGHT("Light"), HEAVY("Heavy");
            String val;

            Weight(String val) {
                this.val = val;
            }
        }

        enum Opacity {
            TRANSPARENT("Transparent"), TRANSLUCENT("Translucent"), OPAQUE("opaque");
            String val;

            Opacity(String val) {
                this.val = val;
            }
        }

        enum Structure {
            RIGID("Rigid"), BENDY("Bendy"), ELASTIC("Elastic");
            String val;

            Structure(String val) {
                this.val = val;
            }
        }

        enum Breathable {
            BREATHABLE("Breathable"), NONBREATHABLE("Nonbreathable");
            String val;

            Breathable(String val) {
                this.val = val;
            }
        }

    }
}
