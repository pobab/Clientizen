package com.denizenscript.clientizen.objects;

import com.denizenscript.denizencore.objects.ObjectFetcher;

public class ClientizenObjectRegistery {

	public static void registerTagHandlers() {

	}

	public static void registerObjects() {
		ObjectFetcher.registerCoreObjects();

		registerObjectTypes();
		registerTagHandlers();
	}

	public static void registerObjectTypes() {

	}
}
