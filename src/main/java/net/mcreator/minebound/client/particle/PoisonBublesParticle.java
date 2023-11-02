
package net.mcreator.minebound.client.particle;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.particle.TextureSheetParticle;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.particle.ParticleRenderType;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.multiplayer.ClientLevel;

@OnlyIn(Dist.CLIENT)
public class PoisonBublesParticle extends TextureSheetParticle {
	public static PoisonBublesParticleProvider provider(SpriteSet spriteSet) {
		return new PoisonBublesParticleProvider(spriteSet);
	}

	public static class PoisonBublesParticleProvider implements ParticleProvider<SimpleParticleType> {
		private final SpriteSet spriteSet;

		public PoisonBublesParticleProvider(SpriteSet spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
			return new PoisonBublesParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
		}
	}

	private final SpriteSet spriteSet;

	protected PoisonBublesParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
		super(world, x, y, z);
		this.spriteSet = spriteSet;
		this.setSize(0.1f, 0.1f);
		this.quadSize *= 0.5f;
		this.lifetime = 20;
		this.gravity = 0f;
		this.hasPhysics = false;
		this.xd = vx * 1;
		this.yd = vy * 1;
		this.zd = vz * 1;
		this.setSpriteFromAge(spriteSet);
	}

	@Override
	public ParticleRenderType getRenderType() {
		return ParticleRenderType.PARTICLE_SHEET_TRANSLUCENT;
	}

	@Override
	public void tick() {
		super.tick();
		if (!this.removed) {
			this.setSprite(this.spriteSet.get((this.age / 1) % 1 + 1, 1));
		}
	}
}
