package steamcraft.client.renderers.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;

import steamcraft.common.tiles.energy.TileBattery;

/**
 * ModelBattery - Either Mojang or a mod author Created using Tabula 4.0.0
 */
public class ModelBattery extends ModelBase
{
	public ModelRenderer wire14;
	public ModelRenderer wire11;
	public ModelRenderer wire13;
	public ModelRenderer wire12;
	public ModelRenderer jar4;
	public ModelRenderer jar3;
	public ModelRenderer jar2;
	public ModelRenderer jar1;
	public ModelRenderer top;
	public ModelRenderer wire3;
	public ModelRenderer wire4;
	public ModelRenderer wire1;
	public ModelRenderer wire2;
	public ModelRenderer top1;
	public ModelRenderer upright1;
	public ModelRenderer upright;
	public ModelRenderer upright2;
	public ModelRenderer upright3;
	public ModelRenderer wire9;
	public ModelRenderer upright4;
	public ModelRenderer wire8;
	public ModelRenderer wire7;
	public ModelRenderer wire6;
	public ModelRenderer base;
	public ModelRenderer lid1;
	public ModelRenderer lid2;
	public ModelRenderer lid3;
	public ModelRenderer lid4;

	public ModelBattery()
	{
		this.textureWidth = 64;
		this.textureHeight = 32;
		this.wire13 = new ModelRenderer(this, 8, 20);
		this.wire13.setRotationPoint(-1.5F, 16.0F, -1.5F);
		this.wire13.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
		this.upright3 = new ModelRenderer(this, 0, 20);
		this.upright3.setRotationPoint(-1.0F, 16.0F, -8.0F);
		this.upright3.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2);
		this.wire1 = new ModelRenderer(this, 8, 20);
		this.wire1.setRotationPoint(2.5F, 16.5F, -3.5F);
		this.wire1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
		this.top = new ModelRenderer(this, 0, 0);
		this.top.setRotationPoint(-1.0F, 15.0F, -8.0F);
		this.top.addBox(0.0F, 0.0F, 0.0F, 2, 1, 7);
		this.lid3 = new ModelRenderer(this, 36, 11);
		this.lid3.setRotationPoint(-6.5F, 16.9F, 2.5F);
		this.lid3.addBox(0.0F, 0.0F, 0.0F, 4, 1, 4);
		this.jar3 = new ModelRenderer(this, 36, 0);
		this.jar3.setRotationPoint(-7.0F, 18.0F, -7.0F);
		this.jar3.addBox(0.0F, 0.0F, 0.0F, 5, 6, 5);
		this.wire9 = new ModelRenderer(this, 8, 20);
		this.wire9.setRotationPoint(1.5F, 16.0F, -2.5F);
		this.wire9.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
		this.wire2 = new ModelRenderer(this, 8, 20);
		this.wire2.setRotationPoint(2.5F, 16.5F, 2.5F);
		this.wire2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
		this.lid2 = new ModelRenderer(this, 36, 11);
		this.lid2.setRotationPoint(2.5F, 16.9F, 2.5F);
		this.lid2.addBox(0.0F, 0.0F, 0.0F, 4, 1, 4);
		this.top1 = new ModelRenderer(this, 0, 17);
		this.top1.setRotationPoint(-7.0F, 15.0F, -1.0F);
		this.top1.addBox(0.0F, 0.0F, 0.0F, 15, 1, 2);
		this.wire4 = new ModelRenderer(this, 8, 20);
		this.wire4.setRotationPoint(-3.5F, 16.5F, -3.5F);
		this.wire4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
		this.wire8 = new ModelRenderer(this, 8, 20);
		this.wire8.setRotationPoint(-2.5F, 16.0F, -2.5F);
		this.wire8.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
		this.wire11 = new ModelRenderer(this, 8, 20);
		this.wire11.setRotationPoint(0.5F, 16.0F, 0.5F);
		this.wire11.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
		this.lid1 = new ModelRenderer(this, 36, 11);
		this.lid1.setRotationPoint(2.5F, 16.9F, -6.5F);
		this.lid1.addBox(0.0F, 0.0F, 0.0F, 4, 1, 4);
		this.wire14 = new ModelRenderer(this, 8, 20);
		this.wire14.setRotationPoint(0.5F, 16.0F, -1.5F);
		this.wire14.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
		this.base = new ModelRenderer(this, 0, 0);
		this.base.setRotationPoint(-1.0F, 15.0F, 1.0F);
		this.base.addBox(0.0F, 0.0F, 0.0F, 2, 1, 7);
		this.upright1 = new ModelRenderer(this, 0, 20);
		this.upright1.setRotationPoint(-7.0F, 16.0F, -1.0F);
		this.upright1.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2);
		this.jar4 = new ModelRenderer(this, 36, 0);
		this.jar4.setRotationPoint(2.0F, 18.0F, -7.0F);
		this.jar4.addBox(0.0F, 0.0F, 0.0F, 5, 6, 5);
		this.jar2 = new ModelRenderer(this, 37, 0);
		this.jar2.setRotationPoint(-7.0F, 18.0F, 2.0F);
		this.jar2.addBox(0.0F, 0.0F, 0.0F, 5, 6, 5);
		this.upright4 = new ModelRenderer(this, 0, 20);
		this.upright4.setRotationPoint(-1.0F, 16.0F, -1.0F);
		this.upright4.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2);
		this.upright2 = new ModelRenderer(this, 0, 20);
		this.upright2.setRotationPoint(-1.0F, 16.0F, 6.0F);
		this.upright2.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2);
		this.wire12 = new ModelRenderer(this, 8, 20);
		this.wire12.setRotationPoint(-1.5F, 16.0F, 0.5F);
		this.wire12.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
		this.wire3 = new ModelRenderer(this, 8, 20);
		this.wire3.setRotationPoint(-3.5F, 16.5F, 2.5F);
		this.wire3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
		this.wire7 = new ModelRenderer(this, 8, 20);
		this.wire7.setRotationPoint(-2.5F, 16.0F, 1.5F);
		this.wire7.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
		this.jar1 = new ModelRenderer(this, 36, 0);
		this.jar1.setRotationPoint(2.0F, 18.0F, 2.0F);
		this.jar1.addBox(0.0F, 0.0F, 0.0F, 5, 6, 5);
		this.upright = new ModelRenderer(this, 0, 20);
		this.upright.setRotationPoint(6.0F, 16.0F, -1.0F);
		this.upright.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2);
		this.wire6 = new ModelRenderer(this, 8, 20);
		this.wire6.setRotationPoint(1.5F, 16.0F, 1.5F);
		this.wire6.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
		this.lid4 = new ModelRenderer(this, 36, 11);
		this.lid4.setRotationPoint(-6.5F, 16.9F, -6.5F);
		this.lid4.addBox(0.0F, 0.0F, 0.0F, 4, 1, 4);
	}

	// @Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5, TileEntity tile)
	{
		this.upright4.render(f5);
		this.base.render(f5);
		this.upright1.render(f5);
		this.top1.render(f5);
		this.top.render(f5);
		this.upright2.render(f5);
		this.upright3.render(f5);
		this.upright.render(f5);

		TileBattery te = (TileBattery) tile;
		ModelRenderer[] jars = { this.jar1, this.jar2, this.jar3, this.jar4 };
		ModelRenderer[] lids = { this.lid1, this.lid2, this.lid3, this.lid4 };
		ModelRenderer[] wires = { this.wire1, this.wire2, this.wire3, this.wire4, this.wire6, this.wire7, this.wire8, this.wire9, this.wire11, this.wire12,
				this.wire13, this.wire14 };
		if(tile != null)
			for(int i = 0; i < jars.length; i++)
			{
				if(te.inventory[i] != null)
				{
					jars[i].render(f5);
					lids[i].render(f5);
					for(ModelRenderer wire : wires)
						wire.render(f5);
				}
				if(te.inventory == null)
				{
					jars[i].render(f5);
					lids[i].render(f5);
					wires[i].render(f5);
				}
			}
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
	{
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
