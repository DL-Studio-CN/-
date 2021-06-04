package ink.ptms.chemdah.core.quest.objective.brewery

import com.dre.brewery.api.events.PlayerPushEvent
import ink.ptms.chemdah.core.quest.objective.Dependency
import ink.ptms.chemdah.core.quest.objective.ObjectiveCountableI

/**
 * Chemdah
 * ink.ptms.chemdah.core.quest.objiective.brewery.BPush
 *
 * @author Peng_Lx
 * @since 2021/6/4 23:02 下午
 */
@Dependency("Brewery")
object BPush : ObjectiveCountableI<PlayerPushEvent>() {

    override val name = "brewery push"
    override val event = PlayerPushEvent::class

    init {
        handler {
            player
        }
        addCondition("position") {
            toPosition().inside(it.player.location)
        }
    }
}