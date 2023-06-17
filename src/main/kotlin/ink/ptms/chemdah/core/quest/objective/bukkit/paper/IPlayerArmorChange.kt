package包 ink.ptms.chemdah.core.quest.objective.bukkit.paper

import导入 com.destroystokyo.paper.event.player.PlayerArmorChangeEvent
import导入 ink.ptms.chemdah.core.quest.objective.ObjectiveCountableI

object对象 IPlayerArmorChange : ObjectiveCountableI<PlayerArmorChangeEvent>() {IPlayerArmorChange : ObjectiveCountableI<PlayerArmorChangeEvent>() {
    重写 val 名称：String = "armor change"override val name: String = "armor change"
    覆盖 val 事件：Class<PlayerArmorChangeEvent> = PlayerArmorChangeEvent::class.javaoverride val event: Class<PlayerArmorChangeEvent> = PlayerArmorChangeEvent::class.java

    在里面 {init {
        处理程序{
            它.player
        }
        addSimpleCondition("chest") { 数据，e ->"chest") { data, e ->
            data.toInferItem().isItem(e.newItem!!)data.toInferItem().isItem(e.newItem!!)
        }
        addSimpleCondition("feet") { 数据，e ->"feet") { data, e ->
            data.toInferItem().isItem(e.newItem!!)data.toInferItem().isItem(e.newItem!!)
        }
        addSimpleCondition("head") { 数据，e ->"head") { data, e ->
            data.toInferItem().isItem(e.newItem!!)data.toInferItem().isItem(e.newItem!!)
        }
        addSimpleCondition("legs") { 数据，e ->"legs") { data, e ->
            data.toInferItem().isItem(e.newItem!!)data.toInferItem().isItem(e.newItem!!)
        }
        addSimpleCondition("slot") { data, e ->
            e.slotType.name == data.toString()
        }
    }
}
