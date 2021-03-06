---
layout: default
title: Concepts / high-level overview
nav_order: 3
---

# Concepts and a high-level overview of the system

## Polys
A poly defines how a block, item or other polyable thing should be converted from the serverside to the clientside.

### Types of polys
* [Item Polys](item-polys.html)
* [Block Polys](block-polys.html)
* Gui Polys (no documentation yet)

## A PolyMap
PolyMc stores these Polys in a PolyMap. The PolyMap is defined per player. 
PolyMc queries the player's PolyMap to get the right Poly for a block/item or other polyable.
Although the PolyMap is defined per player, by default there is only a single PolyMap.

### Standard PolyMap generation
PolyMc generates a default PolyMap at launch. It's exposed as `PolyMc#getMainMap()`. 
At startup, PolyMc will create an `PolyRegistry` and pass it through all registered entrypoints. This is to allow mods to add their own Poly's. 
After this, PolyMc will automatically try to generate polys for the remaining modded items and blocks via the `Generator` class.

### PolyMap assignment
Aside from the main PolyMap, generated by PolyMc, mods can assign their own PolyMap to players. This is done via the `PolyMapProvider.EVENT` event.
The resulting map is only stored once and then cached. [More info here](examples.html#creating-a-custom-polymap).