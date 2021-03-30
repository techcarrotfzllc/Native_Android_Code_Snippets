package com.example.tashafi_mobile_native;

import dagger.Component;

@Component (modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MenuFragment fragment);
}
