
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.test.client.particle.PoisonDripParticle;
import net.mcreator.test.client.particle.PoisonBublesParticle;
import net.mcreator.test.client.particle.DripingWetParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TestModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.register(TestModParticleTypes.POISON_DRIP.get(), PoisonDripParticle::provider);
		event.register(TestModParticleTypes.DRIPING_WET.get(), DripingWetParticle::provider);
		event.register(TestModParticleTypes.POISON_BUBLES.get(), PoisonBublesParticle::provider);
	}
}
