
package net.mcreator.minebound.client.particle;

@OnlyIn(Dist.CLIENT)
public class BurningParticleParticle extends TextureSheetParticle {

	public static BurningParticleParticleProvider provider(SpriteSet spriteSet) {
		return new BurningParticleParticleProvider(spriteSet);
	}

	public static class BurningParticleParticleProvider implements ParticleProvider<SimpleParticleType> {
		private final SpriteSet spriteSet;

		public BurningParticleParticleProvider(SpriteSet spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
			return new BurningParticleParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
		}
	}

	private final SpriteSet spriteSet;

	private float angularVelocity;
	private float angularAcceleration;

	protected BurningParticleParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
		super(world, x, y, z);
		this.spriteSet = spriteSet;

		this.setSize(0.2f, 0.2f);

		this.lifetime = 1;

		this.gravity = -0.1f;
		this.hasPhysics = true;

		this.xd = vx * 0.5;
		this.yd = vy * 0.5;
		this.zd = vz * 0.5;

		this.angularVelocity = 0.11399999999999999f;
		this.angularAcceleration = 0f;

		this.pickSprite(spriteSet);
	}

	@Override
	public int getLightColor(float partialTick) {
		return 15728880;
	}

	@Override
	public ParticleRenderType getRenderType() {
		return ParticleRenderType.PARTICLE_SHEET_LIT;
	}

	@Override
	public void tick() {
		super.tick();

		this.oRoll = this.roll;
		this.roll += this.angularVelocity;
		this.angularVelocity += this.angularAcceleration;

	}

}
