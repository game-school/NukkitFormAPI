package ru.nukkitx.forms;

import cn.nukkit.Player;
import cn.nukkit.form.window.FormWindow;

import java.util.HashMap;

public abstract class Form {
    public static HashMap<String, FormResponse> playersForm = new HashMap<>();
    public static HashMap<String, HashMap<String, Object>> paramsForm = new HashMap<>();
    protected FormWindow form;

    public void send(Player player) {
        player.showFormWindow(form);
    }

    @Deprecated
    public void send(Player player, FormResponse response) {
        playersForm.put(player.getName(), response);
        paramsForm.put(player.getName(), null);
        player.showFormWindow(form);
    }

    @Deprecated
    public void send(Player player, FormResponse response, HashMap<String, Object> params) {
        playersForm.put(player.getName(), response);
        paramsForm.put(player.getName(), params);
        player.showFormWindow(form);
    }

    @Deprecated
    public static void sendForm(Player player, FormWindow form, FormResponse response){
        playersForm.put(player.getName(), response);
        paramsForm.put(player.getName(), null);
        player.showFormWindow(form);
    }

    public static void sendForm(Player player, FormWindow form, ModalFormResponse response){
        playersForm.put(player.getName(), response);
        paramsForm.put(player.getName(), null);
        player.showFormWindow(form);
    }

    public static void sendForm(Player player, FormWindow form, CustomFormResponse response){
        playersForm.put(player.getName(), response);
        paramsForm.put(player.getName(), null);
        player.showFormWindow(form);
    }

    public static void sendForm(Player player, FormWindow form, SimpleFormResponse response){
        playersForm.put(player.getName(), response);
        paramsForm.put(player.getName(), null);
        player.showFormWindow(form);
    }

    @Deprecated
    public static void sendForm(Player player, FormWindow form, FormResponse response, HashMap<String, Object> params) {
        playersForm.put(player.getName(), response);
        paramsForm.put(player.getName(), params);
        player.showFormWindow(form);
    }
}