package qianfeng.wechat_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import cn.bmob.newim.bean.BmobIMConversation;
import cn.bmob.newim.bean.BmobIMTextMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        User user = BmobUser.getCurrentUser(this, User.class);
//        BmobIM.connect(user.getObjectId(), new ConnectListener() {
//            @Override
//            public void done(String uid, BmobException e) {
//                if (e == null) {
//                    Toast.makeText(MainActivity.this, "load Successful", Toast.LENGTH_SHORT).show();
//                } else {
//                    Toast.makeText(MainActivity.this, "load failed", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//        BmobIM.getInstance().setOnConnectStatusChangeListener(new ConnectStatusChangeListener() {
//            @Override
//            public void onChange(ConnectionStatus status) {
//                Toast.makeText(MainActivity.this, status.getMsg(), Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        BmobIMUserInfo info = new BmobIMUserInfo();
//        ConversationListener listener = new ConversationListener() {
//            @Override
//            public void done(BmobIMConversation bmobIMConversation, BmobException e) {
//
//            }
//        };
//
////        startPrivateConversation(BmobIMUserInfo info, boolean isTransient, ConversationListener listener);
//        //如果需要更新用户资料，开发者只需要传新的info进去就可以了
////        BmobIM.getInstance().startPrivateConversation( info, new ConversationListener() {
////            @Override
////            public void done(BmobIMConversation c, BmobException e) {
////                if(e==null){
////                    //在此跳转到聊天页面
////                    Bundle bundle = new Bundle();
////                    bundle.putSerializable("c", c);
////                    startActivity(ChatActivity.class, bundle, false);
////                }else{
////                    toast(e.getMessage()+"("+e.getErrorCode()+")");
////                }
////            }
////        });
//
//        //import cn.bmob.newim.bean.BmobIMTextMessage;
//        BmobIMTextMessage bmobIMTextMessage = new BmobIMTextMessage();
//
//        bmobIMTextMessage.setContent("fjlksjflkdsfjds");
//
//        BmobIMConversation bmobIMConversation = new BmobIMConversation();
//
//
//        bmobIMConversation.sendMessage(new cn.bmob.newim.bean.BmobIMTextMessage())
//
//
//        BmobIMTextMessage msg =new BmobIMTextMessage();
//        msg.setContent(text);
////可随意设置额外信息
//        Map<String,Object> map =new HashMap<>();
//        map.put("level", "1");
//        msg.setExtraMap(map);
//        c.sendMessage(msg, new MessageSendListener() {
//            @Override
//            public void onStart(BmobIMMessage msg) {
//                super.onStart(msg);
//                scrollToBottom();
//                adapter.addMessage(msg);
//                adapter.notifyDataSetChanged();
//            }
//
//            @Override
//            public void done(BmobIMMessage msg, BmobException e) {
//                scrollToBottom();
//                adapter.notifyDataSetChanged();
//                edit_msg.setText("");
//                if (e != null) {
//                    toast(e.getMessage());
//                }
//            }
//        });

        BmobIMConversation bmobIMConversation = new BmobIMConversation();
        BmobIMTextMessage bmobIMMessage = new BmobIMTextMessage();
        bmobIMConversation.sendMessage(bmobIMMessage);  
    }
//



}
