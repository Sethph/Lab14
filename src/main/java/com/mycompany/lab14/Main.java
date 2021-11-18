/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab14;

import com.mycompany.lab14.Material.Builder.Texture;
import com.mycompany.lab14.Material.Builder.Weight;
import com.mycompany.lab14.Material.Builder.Opacity;
import com.mycompany.lab14.Material.Builder.Structure;
import com.mycompany.lab14.Material.Builder.Breathable;


/**
 *
 * @author sethp
 */
public class Main {
    public static void main(String[] args) {
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
        
        System.out.println(diamond);
    }
}
