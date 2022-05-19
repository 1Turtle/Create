package com.simibubi.create;

import com.simibubi.create.content.logistics.trains.entity.CarriageSyncDataSerializer;

import net.minecraft.network.syncher.EntityDataSerializers;

public class AllEntityDataSerializers {

	public static final CarriageSyncDataSerializer CARRIAGE_DATA = new CarriageSyncDataSerializer();

	public static void register() {
		EntityDataSerializers.registerSerializer(CARRIAGE_DATA)/*.setRegistryName(Create.asResource("carriage_data")))*/;
	}

}
