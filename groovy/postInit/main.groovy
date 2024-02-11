// crafting recipes
crafting.addShaped('redstone_engineering_block', item('immersiveengineering:metal_decoration0', 3) * 1, [
        [metaitem('cableGtSingleTin'), item('gregtech:meta_plate', 2064), metaitem('cableGtSingleTin')],
        [item('gregtech:meta_item_1', 217), item('gregtech:machine', 986), item('gregtech:meta_item_1', 232)], 
        [metaitem('cableGtSingleTin'), item('gregtech:meta_plate', 2064), metaitem('cableGtSingleTin')]
])

crafting.addShaped('heavy_engineering_block', item('immersiveengineering:metal_decoration0', 5) * 1, [
        [item('gregtech:meta_item_1', 172), item('immersiveengineering:material', 9), item('gregtech:meta_item_1', 172)],
        [item('gregtech:meta_plate', 324), item('gregtech:machine', 986), item('gregtech:meta_plate', 324)], 
        [item('gregtech:meta_item_1', 172), item('immersiveengineering:material', 9), item('gregtech:meta_item_1', 172)]
])

crafting.addShaped('steel_component', item('immersiveengineering:material', 9) * 2, [ //this doesnt work btw
        [item('gregtech:wire_single', 25),item('gregtech:meta_plate', 324), item('gregtech:wire_single', 25)],
        [item('gregtech:meta_plate', 324), null, item('gregtech:meta_plate', 324)], 
        [item('gregtech:wire_single', 25), item('gregtech:meta_plate', 324) item('gregtech:wire_single', 25)]
])
// assembler recipes
recipemap('assembler').recipeBuilder()
        .fluidInputs(liquid('redstone') * 144)
        .inputs(item('gregtech:meta_wire_fine', 112) * 4,item('gregtech:machine', 986), item('gregtech:meta_item_1', 217), item('gregtech:meta_item_1', 232))
        .outputs(item('immersiveengineering:metal_decoration0', 3) * 1)
        .duration(50)
        .EUt(16)
        .buildAndRegister()

// chemical reactor recipes
recipemap('chemical_reactor').recipeBuilder()
        .fluidInputs(liquid('hydrogen')*720,liquid('potassium')*144,liquid('oxygen')*144)
        .inputs(item('gregtech:meta_dust', 18),item('gregtech:meta_dust', 103) * 2)
        .outputs(item('pexologicaljourney:pex_ingot') * 12)
        .duration(500)
        .EUt(524000)
        .buildAndRegister()

// remove recipes
//crafting.remove(item(recipe name here)) 
