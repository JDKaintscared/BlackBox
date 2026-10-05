/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package top.niunaijun.blackbox.core.system.notification;
public interface IBNotificationManagerService extends android.os.IInterface
{
  /** Default implementation for IBNotificationManagerService. */
  public static class Default implements top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService
  {
    @Override public android.app.NotificationChannel getNotificationChannel(java.lang.String channelId, int userId) throws android.os.RemoteException
    {
      return null;
    }
    @Override public java.util.List<android.app.NotificationChannel> getNotificationChannels(java.lang.String packageName, int userId) throws android.os.RemoteException
    {
      return null;
    }
    @Override public java.util.List<android.app.NotificationChannelGroup> getNotificationChannelGroups(java.lang.String packageName, int userId) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void createNotificationChannel(android.app.NotificationChannel notificationChannel, int userId) throws android.os.RemoteException
    {
    }
    @Override public void deleteNotificationChannel(java.lang.String channelId, int userId) throws android.os.RemoteException
    {
    }
    @Override public void createNotificationChannelGroup(android.app.NotificationChannelGroup notificationChannelGroup, int userId) throws android.os.RemoteException
    {
    }
    @Override public void deleteNotificationChannelGroup(java.lang.String groupId, int userId) throws android.os.RemoteException
    {
    }
    @Override public void enqueueNotificationWithTag(int id, java.lang.String tag, android.app.Notification notification, int userId) throws android.os.RemoteException
    {
    }
    @Override public void cancelNotificationWithTag(int id, java.lang.String tag, int userId) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService
  {
    private static final java.lang.String DESCRIPTOR = "top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService interface,
     * generating a proxy if needed.
     */
    public static top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService))) {
        return ((top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService)iin);
      }
      return new top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_getNotificationChannel:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          android.app.NotificationChannel _result = this.getNotificationChannel(_arg0, _arg1);
          reply.writeNoException();
          if ((_result!=null)) {
            reply.writeInt(1);
            _result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        case TRANSACTION_getNotificationChannels:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          java.util.List<android.app.NotificationChannel> _result = this.getNotificationChannels(_arg0, _arg1);
          reply.writeNoException();
          reply.writeTypedList(_result);
          return true;
        }
        case TRANSACTION_getNotificationChannelGroups:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          java.util.List<android.app.NotificationChannelGroup> _result = this.getNotificationChannelGroups(_arg0, _arg1);
          reply.writeNoException();
          reply.writeTypedList(_result);
          return true;
        }
        case TRANSACTION_createNotificationChannel:
        {
          data.enforceInterface(descriptor);
          android.app.NotificationChannel _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.app.NotificationChannel.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _arg1;
          _arg1 = data.readInt();
          this.createNotificationChannel(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_deleteNotificationChannel:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          this.deleteNotificationChannel(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_createNotificationChannelGroup:
        {
          data.enforceInterface(descriptor);
          android.app.NotificationChannelGroup _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.app.NotificationChannelGroup.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _arg1;
          _arg1 = data.readInt();
          this.createNotificationChannelGroup(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_deleteNotificationChannelGroup:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          this.deleteNotificationChannelGroup(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_enqueueNotificationWithTag:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          android.app.Notification _arg2;
          if ((0!=data.readInt())) {
            _arg2 = android.app.Notification.CREATOR.createFromParcel(data);
          }
          else {
            _arg2 = null;
          }
          int _arg3;
          _arg3 = data.readInt();
          this.enqueueNotificationWithTag(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_cancelNotificationWithTag:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          this.cancelNotificationWithTag(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public android.app.NotificationChannel getNotificationChannel(java.lang.String channelId, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.app.NotificationChannel _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(channelId);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getNotificationChannel, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getNotificationChannel(channelId, userId);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = android.app.NotificationChannel.CREATOR.createFromParcel(_reply);
          }
          else {
            _result = null;
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public java.util.List<android.app.NotificationChannel> getNotificationChannels(java.lang.String packageName, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<android.app.NotificationChannel> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(packageName);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getNotificationChannels, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getNotificationChannels(packageName, userId);
          }
          _reply.readException();
          _result = _reply.createTypedArrayList(android.app.NotificationChannel.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public java.util.List<android.app.NotificationChannelGroup> getNotificationChannelGroups(java.lang.String packageName, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<android.app.NotificationChannelGroup> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(packageName);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getNotificationChannelGroups, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getNotificationChannelGroups(packageName, userId);
          }
          _reply.readException();
          _result = _reply.createTypedArrayList(android.app.NotificationChannelGroup.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void createNotificationChannel(android.app.NotificationChannel notificationChannel, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((notificationChannel!=null)) {
            _data.writeInt(1);
            notificationChannel.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_createNotificationChannel, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().createNotificationChannel(notificationChannel, userId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void deleteNotificationChannel(java.lang.String channelId, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(channelId);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_deleteNotificationChannel, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().deleteNotificationChannel(channelId, userId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void createNotificationChannelGroup(android.app.NotificationChannelGroup notificationChannelGroup, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((notificationChannelGroup!=null)) {
            _data.writeInt(1);
            notificationChannelGroup.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_createNotificationChannelGroup, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().createNotificationChannelGroup(notificationChannelGroup, userId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void deleteNotificationChannelGroup(java.lang.String groupId, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(groupId);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_deleteNotificationChannelGroup, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().deleteNotificationChannelGroup(groupId, userId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void enqueueNotificationWithTag(int id, java.lang.String tag, android.app.Notification notification, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(id);
          _data.writeString(tag);
          if ((notification!=null)) {
            _data.writeInt(1);
            notification.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_enqueueNotificationWithTag, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().enqueueNotificationWithTag(id, tag, notification, userId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void cancelNotificationWithTag(int id, java.lang.String tag, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(id);
          _data.writeString(tag);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_cancelNotificationWithTag, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().cancelNotificationWithTag(id, tag, userId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService sDefaultImpl;
    }
    static final int TRANSACTION_getNotificationChannel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_getNotificationChannels = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_getNotificationChannelGroups = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_createNotificationChannel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_deleteNotificationChannel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_createNotificationChannelGroup = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_deleteNotificationChannelGroup = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_enqueueNotificationWithTag = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_cancelNotificationWithTag = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    public static boolean setDefaultImpl(top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService impl) {
      // Only one user of this interface can use this function
      // at a time. This is a heuristic to detect if two different
      // users in the same process use this function.
      if (Stub.Proxy.sDefaultImpl != null) {
        throw new IllegalStateException("setDefaultImpl() called twice");
      }
      if (impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public android.app.NotificationChannel getNotificationChannel(java.lang.String channelId, int userId) throws android.os.RemoteException;
  public java.util.List<android.app.NotificationChannel> getNotificationChannels(java.lang.String packageName, int userId) throws android.os.RemoteException;
  public java.util.List<android.app.NotificationChannelGroup> getNotificationChannelGroups(java.lang.String packageName, int userId) throws android.os.RemoteException;
  public void createNotificationChannel(android.app.NotificationChannel notificationChannel, int userId) throws android.os.RemoteException;
  public void deleteNotificationChannel(java.lang.String channelId, int userId) throws android.os.RemoteException;
  public void createNotificationChannelGroup(android.app.NotificationChannelGroup notificationChannelGroup, int userId) throws android.os.RemoteException;
  public void deleteNotificationChannelGroup(java.lang.String groupId, int userId) throws android.os.RemoteException;
  public void enqueueNotificationWithTag(int id, java.lang.String tag, android.app.Notification notification, int userId) throws android.os.RemoteException;
  public void cancelNotificationWithTag(int id, java.lang.String tag, int userId) throws android.os.RemoteException;
}
