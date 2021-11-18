/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab14;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author sethp
 */
public class MaterialTest {

    @Test
    public void testToString1() {
        System.out.println("toString");
        Material steel = new Material.Builder(Material.Builder.Texture.SOFT, Material.Builder.Weight.HEAVY,
                Material.Builder.Opacity.TRANSLUCENT, Material.Builder.Structure.RIGID, Material.Builder.Breathable.NONBREATHABLE)
                .absorbent(false)
                .alcoholResist(true)
                .build();
        String expResult = "Material:\n"
                + "texture=Soft\n"
                + "weight=Heavy\n"
                + "opacity=Translucent\n"
                + "structure=Rigid\n"
                + "breathable=Nonbreathable\n"
                + "absorbent=No\n"
                + "acidResist=Yes";

        String result = steel.toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testToString2() {
        System.out.println("toString");
        Material iron = new Material.Builder(Material.Builder.Texture.SOFT, Material.Builder.Weight.HEAVY,
                Material.Builder.Opacity.TRANSLUCENT, Material.Builder.Structure.ELASTIC, Material.Builder.Breathable.NONBREATHABLE)
                .build();
        String expResult = "Material:\n"
                + "texture=Soft\n"
                + "weight=Heavy\n"
                + "opacity=Translucent\n"
                + "structure=Elastic\n"
                + "breathable=Nonbreathable";

        String result = iron.toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testToString3() {
        System.out.println("toString");
         Material diamond = new Material.Builder(Material.Builder.Texture.HARD, Material.Builder.Weight.LIGHT,
                Material.Builder.Opacity.OPAQUE, Material.Builder.Structure.RIGID, Material.Builder.Breathable.NONBREATHABLE)
                .absorbent(false)
                .alcoholResist(true)
                .acidResist(true)
                .alkaliResist(true)
                .coldResist(true)
                .heatResist(true)
                .mineralOilResist(true)
                .moistureResist(true)
                .recyclable(true)
                .shiny(true)
                .waterproof(true)
                .windproof(true)
                .build();
        String expResult = "Material:\n"
                + "texture=Hard\n"
                + "weight=Light\n"
                + "opacity=opaque\n"
                + "structure=Rigid\n"
                + "breathable=Nonbreathable\n"
                + "waterproof=Yes\n"
                + "absorbent=No\n"
                + "moistureResist=Yes\n"
                + "shiny=Yes\n"
                + "heatResist=Yes\n"
                + "coldResist=Yes\n"
                + "acidResist=Yes\n"
                + "mineralOilResist=Yes\n"
                + "recyclable=Yes";

        String result = diamond.toString();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testToString4() {
        System.out.println("toString");
        Material wool = new Material.Builder(Material.Builder.Texture.SOFT, Material.Builder.Weight.LIGHT,
                Material.Builder.Opacity.TRANSLUCENT, Material.Builder.Structure.BENDY, Material.Builder.Breathable.BREATHABLE)
                .build();
        String expResult = "Material:\n"
                + "texture=Soft\n"
                + "weight=Light\n"
                + "opacity=Translucent\n"
                + "structure=Bendy\n"
                + "breathable=Breathable";

        String result = wool.toString();
        assertEquals(expResult, result);
    }

}
