package qianfeng.wechat_app.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import org.greenrobot.eventbus.EventBus;

import java.util.logging.Logger;

import cn.bmob.newim.bean.BmobIMMessage;
import cn.bmob.newim.bean.BmobIMMessageType;
import cn.bmob.newim.event.MessageEvent;
import cn.bmob.newim.notification.BmobNotificationManager;
import cn.bmob.v3.exception.BmobException;

/**
 * Created by Administrator on 2016/11/7 0007.
 */
public class MessageReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(final Context context, Intent intent) {
        if(intent!=null){
            final MessageEvent event =(MessageEvent)intent.getSerializableExtra("event");
            //可以统一在此检测更新会话及用户信息
            UserModel.getInstance().updateUserInfo(event, new UpdateCacheListener() {
                @Override
                public void done(BmobException e) {
                    BmobIMMessage msg = event.getMessage();
                    //用户自定义的消息类型，其类型值均为0
                    if(BmobIMMessageType.getMessageTypeValue(msg.getMsgType())==0){
                        //自行处理自定义消息类型
                        Logger.i(msg.getMsgType() + "," + msg.getContent() + "," + msg.getExtra());
                    }else{//SDK内部内部支持的消息类型
                        if (BmobNotificationManager.getInstance(context).isShowNotification()){
                            //如果需要显示通知栏，可以使用BmobNotificationManager类提供的方法，也可以自己写通知栏显示方法
                        }else{//直接发送消息事件
                            Logger.i("当前处于应用内，发送event");
                            EventBus.getDefault().post(event);
                        }
                    }
                }
            });
}
