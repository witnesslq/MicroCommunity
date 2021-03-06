package com.java110.order.type;

import com.java110.core.event.AppEvent;

import java.util.EventListener;

/**
 * 通用事件处理，
 * Created by wuxw on 2017/4/14.
 */
public interface AppListener<E extends AppEvent> extends EventListener {

    /**
     * Handle an application event.
     * @param event the event to respond to
     */
    void onJava110Event(E event);

}
