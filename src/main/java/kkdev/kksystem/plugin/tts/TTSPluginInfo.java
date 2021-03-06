package kkdev.kksystem.plugin.tts;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import kkdev.kksystem.base.classes.plugins.PluginInfo;
import kkdev.kksystem.base.classes.plugins.simple.IPluginInfoRequest;
import kkdev.kksystem.base.constants.PluginConsts;

/**
 *
 * @author Garikk
 */
public class TTSPluginInfo  implements IPluginInfoRequest {

    /**
     *
     * @return Return plugin information for KKController plugin manager
     */
    @Override
    public PluginInfo getPluginInfo()
    {
        PluginInfo Ret=new PluginInfo();
        
        Ret.PluginName="KKTTS";
        Ret.PluginDescription="Basic TextToSpeech plugin";
        Ret.PluginVersion=1;
        Ret.Enabled=true;
        Ret.ReceivePins = getMyReceivePinInfo();
        Ret.TransmitPins = getMyTransmitPinInfo();
        Ret.PluginUUID="3e804991-82fa-4ce9-86e8-b304bd939c73";
        return Ret;
    }
    
    
    private String[] getMyReceivePinInfo() {

        String[] Ret = new String[2];

        Ret[0] = PluginConsts.KK_PLUGIN_BASE_PIN_COMMAND;
        Ret[1] = PluginConsts.KK_PLUGIN_BASE_BASIC_TAGGEDOBJ_DATA;

        return Ret;
    }

    private String[] getMyTransmitPinInfo() {

        String[] Ret = new String[1];
        Ret[0] = PluginConsts.KK_PLUGIN_BASE_BASIC_TAGGEDOBJ_DATA;

        return Ret;
    }

}
