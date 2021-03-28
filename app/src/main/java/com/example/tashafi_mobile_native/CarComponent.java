package com.example.tashafi_mobile_native;

import dagger.Component;

@Component
public interface CarComponent {

    Car getCar();

    void inject(MenuFragment fragment);
}
