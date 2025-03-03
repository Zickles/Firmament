

package moe.nea.firmament.events

import net.minecraft.client.render.Camera
import net.minecraft.client.render.GameRenderer
import net.minecraft.client.render.LightmapTextureManager
import net.minecraft.client.render.RenderTickCounter
import net.minecraft.client.render.VertexConsumerProvider
import net.minecraft.client.util.math.MatrixStack
import net.minecraft.util.math.Position
import net.minecraft.util.math.Vec3d

/**
 * This event is called after all world rendering is done, but before any GUI rendering (including hand) has been done.
 */
data class WorldRenderLastEvent(
    val matrices: MatrixStack,
    val tickCounter: RenderTickCounter,
    val camera: Camera,
    val vertexConsumers: VertexConsumerProvider.Immediate,
) : FirmamentEvent() {
    companion object : FirmamentEventBus<WorldRenderLastEvent>()
}
