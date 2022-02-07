package io.curity.identityserver.plugin.mvnrelated

import se.curity.identityserver.sdk.event.EventListener
import se.curity.identityserver.sdk.event.EventListenerCollection
import se.curity.identityserver.sdk.plugin.descriptor.EventListenerPluginDescriptor

class mvnrelatedEventListenerDescriptor: EventListenerPluginDescriptor<mvnrelatedEventListenerConfig>
{
    override fun getEventListenerCollection() = mvnrelatedListenerCollection::class.java

    override fun getPluginImplementationType() =  "mvnrelated"

    override fun getConfigurationType() = mvnrelatedEventListenerConfig::class.java
}

class mvnrelatedListenerCollection(configuration: mvnrelatedEventListenerConfig): EventListenerCollection
{
    private val listeners: Set<EventListener<*>> = setOf(mvnrelatedEventListener(configuration))

    override fun getListeners(): Set<EventListener<*>> = listeners
}
