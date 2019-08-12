package com.cyber.mobheads.Utilities;

import org.bukkit.entity.*;


public enum MobNames {
	Bat,
	Blaze,
	Cave_Spider,
	Chicken,
	Cow,
	Creeper,
	Charged_Creeper,
	Dolphin,
	Donkey,
	Drowned,
	Elder_Guardian,
	Enderman,
	Endermite,
	Ender_Dragon,
	Evoker,
	Ghast,
	Guardian,
	Black_Horse,
	Brown_Horse,
	Chestnut_Horse,
	Creamy_Horse,
	Dark_Brown_Horse,
	Gray_Horse,
	White_Horse,
	Skeleton_Horse,
	Zombie_Horse,
	Husk,
	Illusioner,
	Iron_Golem,
	Brown_Llama,
	Creamy_Llama,
	Gray_Llama,
	White_Llama,
	Magma_Cube,
	Mooshroom,
	Mule,
	Ocelot,
	Blue_Parrot,
	Cyan_Parrot,
	Gray_Parrot,
	Green_Parrot,
	Red_Parrot,
	Phantom,
	Pig,
	Polar_Bear,
	Black_Rabbit,
	Black_and_White_Rabbit,
	Brown_Rabbit,
	Gold_Rabbit,
	Salt_and_Pepper_Rabbit,
	The_Killer_Bunny,
	Toast_Rabbit,
	White_Rabbit,
	Black_Sheep,
	Blue_Sheep,
	Brown_Sheep,
	Cyan_Sheep,
	Gray_Sheep,
	Green_Sheep,
	Light_Blue_Sheep,
	Lime_Sheep,
	Magenta_Sheep,
	Orange_Sheep,
	Pink_Sheep,
	Purple_Sheep,
	Rainbow_Sheep,
	Red_Sheep,
	Light_Gray_Sheep,
	White_Sheep,
	Yellow_Sheep,
	Shulker,
	Silverfish,
	Skeleton,
	Slime,
	Snow_Golem,
	Spider,
	Squid,
	Stray,
	Turtle,
	Vex,
	Villager,
	Vindicator,
	Witch,
	Wither,
	Wild_Wolf,
	Tamed_Wolf,
	Zombie,
	Zombie_Pigman,
	Zombie_Butcher_Villager,
	Zombie_Cleric_Villager,
	Zombie_Farmer_Villager,
	Zombie_Librarian_Villager,
	Zombie_Nitwit_Villager,
	Zombie_Smith_Villager,

	Tropical_Fish,
	Cod,
	Salmon,
	Pufferfish,

	Wandering_Trader,
	Pillager,
	Ravager, Mooshroom_Brown,
	Panda_Normal, Panda_Aggressive, Panda_Lazy, Panda_Brown, Panda_Worried, Panda_Playful, Panda_Weak, Fox_Normal, Fox_Snow,

	//These are the invalid cats. Still have to load them:
	Black_Cat,
	Ginger_Cat,
	Siamese_Cat,

	Cat_AllBack,
	Cat_Black,
	Cat_British_ShortHair,
	Cat_Calico,
	Cat_Jellie,
	Cat_Persian,
	Cat_Ragdoll,
	Cat_Red,
	Cat_Siamese,
	Cat_Tabby,
	Cat_White,
	;


	public static MobNames getName(Entity entity) {
		switch (entity.getType()) {
			case BAT:
				return Bat;
			case BLAZE:
				return Blaze;
			case OCELOT:
				//As of 1.14, Ocelots do not transform, so they can retain their skin.
				return Ocelot;//getCatName((Ocelot) entity);
			case CAVE_SPIDER:
				return Cave_Spider;
			case CHICKEN:
				return Chicken;
			case COW:
				return Cow;
			case CREEPER:
				return getCreeperName((Creeper) entity);
			case DOLPHIN:
				return Dolphin;
			case DONKEY:
				return Donkey;
			case DROWNED:
				return Drowned;
			case ELDER_GUARDIAN:
				return Elder_Guardian;
			case ENDERMAN:
				return Enderman;
			case ENDERMITE:
				return Endermite;
			case ENDER_DRAGON:
				return Ender_Dragon;
			case EVOKER:
				return Evoker;
			case GHAST:
				return Ghast;
			case GUARDIAN:
				return Guardian;
			case HORSE:
				return getHorseName((Horse) entity);
			case ZOMBIE_HORSE:
				return Zombie_Horse;
			case SKELETON_HORSE:
				return Skeleton_Horse;
			case HUSK:
				return Husk;
			case ILLUSIONER:
				return Illusioner;
			case IRON_GOLEM:
				return Iron_Golem;
			case LLAMA:
			case TRADER_LLAMA:
				return getLLamaName((Llama) entity);
			case MAGMA_CUBE:
				return Magma_Cube;
			case MUSHROOM_COW:
				return getMooshroomName((MushroomCow) entity);
			case MULE:
				return Mule;
			case PARROT:
				return getParrotName((Parrot) entity);
			case PHANTOM:
				return Phantom;
			case PIG:
				return Pig;
			case POLAR_BEAR:
				return Polar_Bear;
			case RABBIT:
				return getRabbitName((Rabbit) entity);
			case SHEEP:
				return getSheepName((Sheep) entity);
			case SHULKER:
				return Shulker;
			case SILVERFISH:
				return Silverfish;
			case SKELETON:
				return Skeleton;
			case SLIME:
				return Slime;
			case SNOWMAN:
				return Snow_Golem;
			case SPIDER:
				return Spider;
			case SQUID:
				return Squid;
			case STRAY:
				return Stray;
			case TURTLE:
				return Turtle;
			case VEX:
				return Vex;
			case VILLAGER:
				return Villager;
			case VINDICATOR:
				return Vindicator;
			case WITCH:
				return Witch;
			case WITHER:
				return Wither;
			case WOLF:
				return getWolfName((Wolf) entity);
			case ZOMBIE:
				return Zombie;
			case PIG_ZOMBIE:
				return Zombie_Pigman;
			case ZOMBIE_VILLAGER:
				return getZombieVillagerName((ZombieVillager) entity);
			case COD:
				return Cod;
			case PUFFERFISH:
				return Pufferfish;
			case SALMON:
				return Salmon;
			case TROPICAL_FISH:
				return Tropical_Fish;
			case ARROW:
				return getFishName(entity);

			case WANDERING_TRADER:
				return Wandering_Trader;
			case PILLAGER:
				return Pillager;
			case RAVAGER:
				return Ravager;

			case CAT:
				return getCatName((Cat) entity);
			case PANDA:
				return getPandaName((Panda) entity);
			case FOX:
				return getFoxName((Fox) entity);
		}
		return null;
	}

	private static MobNames getCatName(Cat ocelot) {

		if (ocelot.getCatType() == null) {
			return null;
		}
		switch (ocelot.getCatType()) {
			case ALL_BLACK:
				return Cat_AllBack;
			case BRITISH_SHORTHAIR:
				return Cat_British_ShortHair;
			case SIAMESE:
				return Cat_Siamese;
			case RAGDOLL:
				return Cat_Ragdoll;
			case PERSIAN:
				return Cat_Persian;
			case JELLIE:
				return Cat_Jellie;
			case CALICO:
				return Cat_Calico;
			case WHITE:
				return Cat_White;
			case TABBY:
				return Cat_Tabby;
			case BLACK:
				return Cat_Black;
			case RED:
				return Cat_Red;
		}
		return null;

	}

	private static MobNames getFoxName(Fox ocelot) {

		if (ocelot.getFoxType() == null) {
			return null;
		}
		switch (ocelot.getFoxType()) {
			case RED:
				return Fox_Normal;
			case SNOW:
				return Fox_Snow;
		}
		return null;

	}

	private static MobNames getCatName(Ocelot ocelot) {
		if (ocelot.getCatType() == null) {
			return null;
		}
		switch (ocelot.getCatType()) {
			case BLACK_CAT:
				return Black_Cat;
			case RED_CAT:
				return Ginger_Cat;
			case SIAMESE_CAT:
				return Siamese_Cat;
			case WILD_OCELOT:
				return Ocelot;
		}
		return null;
	}

	private static MobNames getMooshroomName(MushroomCow mooshroom) {
		if (mooshroom.getVariant() == MushroomCow.Variant.BROWN) {
			return Mooshroom_Brown;
		} else {
			return Mooshroom;
		}
	}

	private static MobNames getCreeperName(Creeper creeper) {
		if (creeper.isPowered()) {
			return Charged_Creeper;
		}
		return Creeper;
	}

	private static MobNames getHorseName(Horse horse) {
		if (horse.getColor() == null) {
			return null;
		}
		switch (horse.getColor()) {
			case BLACK:
				return Black_Horse;
			case BROWN:
				return Brown_Horse;
			case CHESTNUT:
				return Chestnut_Horse;
			case CREAMY:
				return Creamy_Horse;
			case DARK_BROWN:
				return Dark_Brown_Horse;
			case GRAY:
				return Gray_Horse;
			case WHITE:
				return White_Horse;
		}
		return null;
	}

	private static MobNames getLLamaName(Llama llama) {
		if (llama.getColor() == null) {
			return null;
		}
		switch (llama.getColor()) {
			case BROWN:
				return Brown_Llama;
			case CREAMY:
				return Creamy_Llama;
			case GRAY:
				return Gray_Llama;
			case WHITE:
				return White_Llama;
		}
		return null;
	}

	private static MobNames getParrotName(Parrot parrot) {
		if (parrot.getVariant() == null) {
			return null;
		}
		switch (parrot.getVariant()) {
			case BLUE:
				return Blue_Parrot;
			case CYAN:
				return Cyan_Parrot;
			case GRAY:
				return Gray_Parrot;
			case GREEN:
				return Green_Parrot;
			case RED:
				return Red_Parrot;
		}
		return null;
	}

	private static MobNames getRabbitName(Rabbit rabbit) {
		if (rabbit.getCustomName() != null && rabbit.getName().equals("Toast")) {
			return Toast_Rabbit;
		}
		if (rabbit.getRabbitType() == null) {
			return null;
		}
		switch (rabbit.getRabbitType()) {
			case BLACK:
				return Black_Rabbit;
			case BLACK_AND_WHITE:
				return Black_and_White_Rabbit;
			case BROWN:
				return Brown_Rabbit;
			case GOLD:
				return Gold_Rabbit;
			case SALT_AND_PEPPER:
				return Salt_and_Pepper_Rabbit;
			case THE_KILLER_BUNNY:
				return The_Killer_Bunny;
			case WHITE:
				return White_Rabbit;
		}
		return null;
	}

	private static MobNames getPandaName(Panda rabbit) {
		if (rabbit.getMainGene() == null) {
			return null;
		}
		switch (rabbit.getMainGene()) {
			case LAZY:
				return Panda_Lazy;
			case WEAK:
				return Panda_Weak;
			case BROWN:
				return Panda_Brown;
			case NORMAL:
				return Panda_Normal;
			case PLAYFUL:
				return Panda_Playful;
			case WORRIED:
				return Panda_Worried;
			case AGGRESSIVE:
				return Panda_Aggressive;
		}
		return null;
	}

	private static MobNames getSheepName(Sheep sheep) {
		if (sheep.getCustomName() != null && sheep.getCustomName().equals("jeb_")) {
			return Rainbow_Sheep;
		}
		if (sheep.getColor() == null) {
			return null;
		}
		switch (sheep.getColor()) {
			case BLACK:
				return Black_Sheep;
			case BLUE:
				return Blue_Sheep;
			case BROWN:
				return Brown_Sheep;
			case CYAN:
				return Cyan_Sheep;
			case GRAY:
				return Gray_Sheep;
			case GREEN:
				return Green_Sheep;
			case LIGHT_BLUE:
				return Light_Blue_Sheep;
			case LIME:
				return Lime_Sheep;
			case MAGENTA:
				return Magenta_Sheep;
			case ORANGE:
				return Orange_Sheep;
			case PINK:
				return Pink_Sheep;
			case PURPLE:
				return Purple_Sheep;
			case RED:
				return Red_Sheep;
			case LIGHT_GRAY:
				return Light_Gray_Sheep;
			case WHITE:
				return White_Sheep;
			case YELLOW:
				return Yellow_Sheep;
		}
		return null;
	}

	private static MobNames getWolfName(Wolf wolf) {
		/* 428 */
		if (wolf.isTamed()) {
			/* 429 */
			return Tamed_Wolf;
			/*     */
		}
		/*     */
		/* 432 */
		return Wild_Wolf;
		/*     */
	}

	/*     */
	/*     */
	/*     */
	/*     */
	/*     */
	private static MobNames getZombieVillagerName(ZombieVillager zombieVillager) {
		/* 439 */
		if (zombieVillager.getVillagerProfession() == null) {
			/* 440 */
			return null;
			/*     */
		}
		/*     */
		/* 443 */
		switch (zombieVillager.getVillagerProfession()) {
			/*     */
			case TOOLSMITH:
				/* 445 */
				return Zombie_Smith_Villager;
			/*     */
			case BUTCHER:
				/* 447 */
				return Zombie_Butcher_Villager;
			/*     */
			case FARMER:
				/* 449 */
				return Zombie_Farmer_Villager;
			/*     */
			case LIBRARIAN:
				/* 451 */
				return Zombie_Librarian_Villager;
			/*     */
			case NITWIT:
				/* 453 */
				return Zombie_Nitwit_Villager;
			/*     */
			case CLERIC:
				/* 455 */
				return Zombie_Cleric_Villager;
			/*     */
		}
		/* 457 */
		return null;
		/*     */
	}

	/*     */
	/*     */
	/*     */
	/*     */
	private static MobNames getFishName(Entity entity) {
		/* 463 */
		if (entity.getName() == null) {
			/* 464 */
			return null;
			/*     */
		}
		/*     */
		/* 467 */
		switch (entity.getName()) {
			/*     */
			case "Raw Cod":
				/* 469 */
				return Cod;
			/*     */
			case "Raw Salmon":
				/* 471 */
				return Salmon;
			/*     */
			case "Pufferfish":
				/* 473 */
				return Pufferfish;
			/*     */
			case "Tropical Fish":
				/* 475 */
				return Tropical_Fish;
			/*     */
		}
		/* 477 */
		return null;
		/*     */
	}
	/*     */
}


/* Location:              F:\Minecraft Servers\SpigotLobby\plugins\MobHeads 2.4.jar!\com\cyber\mobheads\Utilities\MobNames.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */