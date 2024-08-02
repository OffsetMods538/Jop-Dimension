package top.offsetmonkey538.jopdimension;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import top.offsetmonkey538.jopdimension.block.ModBlocks;
import top.offsetmonkey538.monkeylib538.utils.IdentifierUtils;

public class JopDimension implements ModInitializer {
	public static final String MOD_ID = "jop-dimension";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.register();
	}

	public static Identifier id(String path) {
		return IdentifierUtils.INSTANCE.of(MOD_ID, path);
	}
}
