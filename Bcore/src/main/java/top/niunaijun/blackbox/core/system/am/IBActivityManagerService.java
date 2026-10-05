/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package top.niunaijun.blackbox.core.system.am;
// Declare any non-default types here with import statements

public interface IBActivityManagerService extends android.os.IInterface
{
  /** Default implementation for IBActivityManagerService. */
  public static class Default implements top.niunaijun.blackbox.core.system.am.IBActivityManagerService
  {
    @Override public top.niunaijun.blackbox.entity.AppConfig initProcess(java.lang.String packageName, java.lang.String processName, int userId) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void restartProcess(java.lang.String packageName, java.lang.String processName, int userId) throws android.os.RemoteException
    {
    }
    @Override public void startActivity(android.content.Intent intent, int userId) throws android.os.RemoteException
    {
    }
    @Override public int startActivityAms(int userId, android.content.Intent intent, java.lang.String resolvedType, android.os.IBinder resultTo, java.lang.String resultWho, int requestCode, int flags, android.os.Bundle options) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public int startActivities(int userId, android.content.Intent[] intent, java.lang.String[] resolvedType, android.os.IBinder resultTo, android.os.Bundle options) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public android.content.ComponentName startService(android.content.Intent intent, java.lang.String resolvedType, boolean requireForeground, int userId) throws android.os.RemoteException
    {
      return null;
    }
    @Override public int stopService(android.content.Intent intent, java.lang.String resolvedType, int userId) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public android.content.Intent bindService(android.content.Intent service, android.os.IBinder binder, java.lang.String resolvedType, int userId) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void unbindService(android.os.IBinder binder, int userId) throws android.os.RemoteException
    {
    }
    @Override public void stopServiceToken(android.content.ComponentName className, android.os.IBinder token, int userId) throws android.os.RemoteException
    {
    }
    @Override public void onStartCommand(android.content.Intent proxyIntent, int userId) throws android.os.RemoteException
    {
    }
    @Override public top.niunaijun.blackbox.entity.UnbindRecord onServiceUnbind(android.content.Intent proxyIntent, int userId) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void onServiceDestroy(android.content.Intent proxyIntent, int userId) throws android.os.RemoteException
    {
    }
    @Override public android.os.IBinder acquireContentProviderClient(android.content.pm.ProviderInfo providerInfo) throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.content.Intent sendBroadcast(android.content.Intent intent, java.lang.String resolvedType, int userId) throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.os.IBinder peekService(android.content.Intent intent, java.lang.String resolvedType, int userId) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void onActivityCreated(int taskId, android.os.IBinder token, android.os.IBinder activityRecord) throws android.os.RemoteException
    {
    }
    @Override public void onActivityResumed(android.os.IBinder token) throws android.os.RemoteException
    {
    }
    @Override public void onActivityDestroyed(android.os.IBinder token) throws android.os.RemoteException
    {
    }
    @Override public void onFinishActivity(android.os.IBinder token) throws android.os.RemoteException
    {
    }
    @Override public top.niunaijun.blackbox.entity.am.RunningAppProcessInfo getRunningAppProcesses(java.lang.String callerPackage, int userId) throws android.os.RemoteException
    {
      return null;
    }
    @Override public top.niunaijun.blackbox.entity.am.RunningServiceInfo getRunningServices(java.lang.String callerPackage, int userId) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void scheduleBroadcastReceiver(android.content.Intent intent, top.niunaijun.blackbox.entity.am.PendingResultData pendingResultData, int userId) throws android.os.RemoteException
    {
    }
    @Override public void finishBroadcast(top.niunaijun.blackbox.entity.am.PendingResultData data) throws android.os.RemoteException
    {
    }
    @Override public java.lang.String getCallingPackage(android.os.IBinder token, int userId) throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.content.ComponentName getCallingActivity(android.os.IBinder token, int userId) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void getIntentSender(android.os.IBinder target, java.lang.String packageName, int uid, int userId) throws android.os.RemoteException
    {
    }
    @Override public java.lang.String getPackageForIntentSender(android.os.IBinder target, int userId) throws android.os.RemoteException
    {
      return null;
    }
    @Override public int getUidForIntentSender(android.os.IBinder target, int userId) throws android.os.RemoteException
    {
      return 0;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements top.niunaijun.blackbox.core.system.am.IBActivityManagerService
  {
    private static final java.lang.String DESCRIPTOR = "top.niunaijun.blackbox.core.system.am.IBActivityManagerService";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an top.niunaijun.blackbox.core.system.am.IBActivityManagerService interface,
     * generating a proxy if needed.
     */
    public static top.niunaijun.blackbox.core.system.am.IBActivityManagerService asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof top.niunaijun.blackbox.core.system.am.IBActivityManagerService))) {
        return ((top.niunaijun.blackbox.core.system.am.IBActivityManagerService)iin);
      }
      return new top.niunaijun.blackbox.core.system.am.IBActivityManagerService.Stub.Proxy(obj);
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
        case TRANSACTION_initProcess:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          top.niunaijun.blackbox.entity.AppConfig _result = this.initProcess(_arg0, _arg1, _arg2);
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
        case TRANSACTION_restartProcess:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          this.restartProcess(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_startActivity:
        {
          data.enforceInterface(descriptor);
          android.content.Intent _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.content.Intent.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _arg1;
          _arg1 = data.readInt();
          this.startActivity(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_startActivityAms:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          android.content.Intent _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.content.Intent.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          java.lang.String _arg2;
          _arg2 = data.readString();
          android.os.IBinder _arg3;
          _arg3 = data.readStrongBinder();
          java.lang.String _arg4;
          _arg4 = data.readString();
          int _arg5;
          _arg5 = data.readInt();
          int _arg6;
          _arg6 = data.readInt();
          android.os.Bundle _arg7;
          if ((0!=data.readInt())) {
            _arg7 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg7 = null;
          }
          int _result = this.startActivityAms(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_startActivities:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          android.content.Intent[] _arg1;
          _arg1 = data.createTypedArray(android.content.Intent.CREATOR);
          java.lang.String[] _arg2;
          _arg2 = data.createStringArray();
          android.os.IBinder _arg3;
          _arg3 = data.readStrongBinder();
          android.os.Bundle _arg4;
          if ((0!=data.readInt())) {
            _arg4 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg4 = null;
          }
          int _result = this.startActivities(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_startService:
        {
          data.enforceInterface(descriptor);
          android.content.Intent _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.content.Intent.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          java.lang.String _arg1;
          _arg1 = data.readString();
          boolean _arg2;
          _arg2 = (0!=data.readInt());
          int _arg3;
          _arg3 = data.readInt();
          android.content.ComponentName _result = this.startService(_arg0, _arg1, _arg2, _arg3);
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
        case TRANSACTION_stopService:
        {
          data.enforceInterface(descriptor);
          android.content.Intent _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.content.Intent.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          int _result = this.stopService(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_bindService:
        {
          data.enforceInterface(descriptor);
          android.content.Intent _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.content.Intent.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          android.os.IBinder _arg1;
          _arg1 = data.readStrongBinder();
          java.lang.String _arg2;
          _arg2 = data.readString();
          int _arg3;
          _arg3 = data.readInt();
          android.content.Intent _result = this.bindService(_arg0, _arg1, _arg2, _arg3);
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
        case TRANSACTION_unbindService:
        {
          data.enforceInterface(descriptor);
          android.os.IBinder _arg0;
          _arg0 = data.readStrongBinder();
          int _arg1;
          _arg1 = data.readInt();
          this.unbindService(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_stopServiceToken:
        {
          data.enforceInterface(descriptor);
          android.content.ComponentName _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          android.os.IBinder _arg1;
          _arg1 = data.readStrongBinder();
          int _arg2;
          _arg2 = data.readInt();
          this.stopServiceToken(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onStartCommand:
        {
          data.enforceInterface(descriptor);
          android.content.Intent _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.content.Intent.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _arg1;
          _arg1 = data.readInt();
          this.onStartCommand(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onServiceUnbind:
        {
          data.enforceInterface(descriptor);
          android.content.Intent _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.content.Intent.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _arg1;
          _arg1 = data.readInt();
          top.niunaijun.blackbox.entity.UnbindRecord _result = this.onServiceUnbind(_arg0, _arg1);
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
        case TRANSACTION_onServiceDestroy:
        {
          data.enforceInterface(descriptor);
          android.content.Intent _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.content.Intent.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _arg1;
          _arg1 = data.readInt();
          this.onServiceDestroy(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_acquireContentProviderClient:
        {
          data.enforceInterface(descriptor);
          android.content.pm.ProviderInfo _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.content.pm.ProviderInfo.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          android.os.IBinder _result = this.acquireContentProviderClient(_arg0);
          reply.writeNoException();
          reply.writeStrongBinder(_result);
          return true;
        }
        case TRANSACTION_sendBroadcast:
        {
          data.enforceInterface(descriptor);
          android.content.Intent _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.content.Intent.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          android.content.Intent _result = this.sendBroadcast(_arg0, _arg1, _arg2);
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
        case TRANSACTION_peekService:
        {
          data.enforceInterface(descriptor);
          android.content.Intent _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.content.Intent.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          android.os.IBinder _result = this.peekService(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeStrongBinder(_result);
          return true;
        }
        case TRANSACTION_onActivityCreated:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          android.os.IBinder _arg1;
          _arg1 = data.readStrongBinder();
          android.os.IBinder _arg2;
          _arg2 = data.readStrongBinder();
          this.onActivityCreated(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onActivityResumed:
        {
          data.enforceInterface(descriptor);
          android.os.IBinder _arg0;
          _arg0 = data.readStrongBinder();
          this.onActivityResumed(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onActivityDestroyed:
        {
          data.enforceInterface(descriptor);
          android.os.IBinder _arg0;
          _arg0 = data.readStrongBinder();
          this.onActivityDestroyed(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onFinishActivity:
        {
          data.enforceInterface(descriptor);
          android.os.IBinder _arg0;
          _arg0 = data.readStrongBinder();
          this.onFinishActivity(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getRunningAppProcesses:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          top.niunaijun.blackbox.entity.am.RunningAppProcessInfo _result = this.getRunningAppProcesses(_arg0, _arg1);
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
        case TRANSACTION_getRunningServices:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          top.niunaijun.blackbox.entity.am.RunningServiceInfo _result = this.getRunningServices(_arg0, _arg1);
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
        case TRANSACTION_scheduleBroadcastReceiver:
        {
          data.enforceInterface(descriptor);
          android.content.Intent _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.content.Intent.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          top.niunaijun.blackbox.entity.am.PendingResultData _arg1;
          if ((0!=data.readInt())) {
            _arg1 = top.niunaijun.blackbox.entity.am.PendingResultData.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          int _arg2;
          _arg2 = data.readInt();
          this.scheduleBroadcastReceiver(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_finishBroadcast:
        {
          data.enforceInterface(descriptor);
          top.niunaijun.blackbox.entity.am.PendingResultData _arg0;
          if ((0!=data.readInt())) {
            _arg0 = top.niunaijun.blackbox.entity.am.PendingResultData.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          this.finishBroadcast(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getCallingPackage:
        {
          data.enforceInterface(descriptor);
          android.os.IBinder _arg0;
          _arg0 = data.readStrongBinder();
          int _arg1;
          _arg1 = data.readInt();
          java.lang.String _result = this.getCallingPackage(_arg0, _arg1);
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_getCallingActivity:
        {
          data.enforceInterface(descriptor);
          android.os.IBinder _arg0;
          _arg0 = data.readStrongBinder();
          int _arg1;
          _arg1 = data.readInt();
          android.content.ComponentName _result = this.getCallingActivity(_arg0, _arg1);
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
        case TRANSACTION_getIntentSender:
        {
          data.enforceInterface(descriptor);
          android.os.IBinder _arg0;
          _arg0 = data.readStrongBinder();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          this.getIntentSender(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getPackageForIntentSender:
        {
          data.enforceInterface(descriptor);
          android.os.IBinder _arg0;
          _arg0 = data.readStrongBinder();
          int _arg1;
          _arg1 = data.readInt();
          java.lang.String _result = this.getPackageForIntentSender(_arg0, _arg1);
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_getUidForIntentSender:
        {
          data.enforceInterface(descriptor);
          android.os.IBinder _arg0;
          _arg0 = data.readStrongBinder();
          int _arg1;
          _arg1 = data.readInt();
          int _result = this.getUidForIntentSender(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements top.niunaijun.blackbox.core.system.am.IBActivityManagerService
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
      @Override public top.niunaijun.blackbox.entity.AppConfig initProcess(java.lang.String packageName, java.lang.String processName, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        top.niunaijun.blackbox.entity.AppConfig _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(packageName);
          _data.writeString(processName);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_initProcess, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().initProcess(packageName, processName, userId);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = top.niunaijun.blackbox.entity.AppConfig.CREATOR.createFromParcel(_reply);
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
      @Override public void restartProcess(java.lang.String packageName, java.lang.String processName, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(packageName);
          _data.writeString(processName);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_restartProcess, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().restartProcess(packageName, processName, userId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void startActivity(android.content.Intent intent, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((intent!=null)) {
            _data.writeInt(1);
            intent.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_startActivity, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().startActivity(intent, userId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public int startActivityAms(int userId, android.content.Intent intent, java.lang.String resolvedType, android.os.IBinder resultTo, java.lang.String resultWho, int requestCode, int flags, android.os.Bundle options) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(userId);
          if ((intent!=null)) {
            _data.writeInt(1);
            intent.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeString(resolvedType);
          _data.writeStrongBinder(resultTo);
          _data.writeString(resultWho);
          _data.writeInt(requestCode);
          _data.writeInt(flags);
          if ((options!=null)) {
            _data.writeInt(1);
            options.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_startActivityAms, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().startActivityAms(userId, intent, resolvedType, resultTo, resultWho, requestCode, flags, options);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int startActivities(int userId, android.content.Intent[] intent, java.lang.String[] resolvedType, android.os.IBinder resultTo, android.os.Bundle options) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(userId);
          _data.writeTypedArray(intent, 0);
          _data.writeStringArray(resolvedType);
          _data.writeStrongBinder(resultTo);
          if ((options!=null)) {
            _data.writeInt(1);
            options.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_startActivities, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().startActivities(userId, intent, resolvedType, resultTo, options);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public android.content.ComponentName startService(android.content.Intent intent, java.lang.String resolvedType, boolean requireForeground, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.content.ComponentName _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((intent!=null)) {
            _data.writeInt(1);
            intent.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeString(resolvedType);
          _data.writeInt(((requireForeground)?(1):(0)));
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_startService, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().startService(intent, resolvedType, requireForeground, userId);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = android.content.ComponentName.CREATOR.createFromParcel(_reply);
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
      @Override public int stopService(android.content.Intent intent, java.lang.String resolvedType, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((intent!=null)) {
            _data.writeInt(1);
            intent.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeString(resolvedType);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_stopService, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().stopService(intent, resolvedType, userId);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public android.content.Intent bindService(android.content.Intent service, android.os.IBinder binder, java.lang.String resolvedType, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.content.Intent _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((service!=null)) {
            _data.writeInt(1);
            service.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeStrongBinder(binder);
          _data.writeString(resolvedType);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_bindService, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().bindService(service, binder, resolvedType, userId);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = android.content.Intent.CREATOR.createFromParcel(_reply);
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
      @Override public void unbindService(android.os.IBinder binder, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder(binder);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_unbindService, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().unbindService(binder, userId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void stopServiceToken(android.content.ComponentName className, android.os.IBinder token, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((className!=null)) {
            _data.writeInt(1);
            className.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeStrongBinder(token);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_stopServiceToken, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().stopServiceToken(className, token, userId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onStartCommand(android.content.Intent proxyIntent, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((proxyIntent!=null)) {
            _data.writeInt(1);
            proxyIntent.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onStartCommand, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onStartCommand(proxyIntent, userId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public top.niunaijun.blackbox.entity.UnbindRecord onServiceUnbind(android.content.Intent proxyIntent, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        top.niunaijun.blackbox.entity.UnbindRecord _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((proxyIntent!=null)) {
            _data.writeInt(1);
            proxyIntent.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onServiceUnbind, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().onServiceUnbind(proxyIntent, userId);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = top.niunaijun.blackbox.entity.UnbindRecord.CREATOR.createFromParcel(_reply);
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
      @Override public void onServiceDestroy(android.content.Intent proxyIntent, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((proxyIntent!=null)) {
            _data.writeInt(1);
            proxyIntent.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onServiceDestroy, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onServiceDestroy(proxyIntent, userId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public android.os.IBinder acquireContentProviderClient(android.content.pm.ProviderInfo providerInfo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.os.IBinder _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((providerInfo!=null)) {
            _data.writeInt(1);
            providerInfo.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_acquireContentProviderClient, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().acquireContentProviderClient(providerInfo);
          }
          _reply.readException();
          _result = _reply.readStrongBinder();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public android.content.Intent sendBroadcast(android.content.Intent intent, java.lang.String resolvedType, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.content.Intent _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((intent!=null)) {
            _data.writeInt(1);
            intent.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeString(resolvedType);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sendBroadcast, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sendBroadcast(intent, resolvedType, userId);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = android.content.Intent.CREATOR.createFromParcel(_reply);
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
      @Override public android.os.IBinder peekService(android.content.Intent intent, java.lang.String resolvedType, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.os.IBinder _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((intent!=null)) {
            _data.writeInt(1);
            intent.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeString(resolvedType);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_peekService, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().peekService(intent, resolvedType, userId);
          }
          _reply.readException();
          _result = _reply.readStrongBinder();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void onActivityCreated(int taskId, android.os.IBinder token, android.os.IBinder activityRecord) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(taskId);
          _data.writeStrongBinder(token);
          _data.writeStrongBinder(activityRecord);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onActivityCreated, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onActivityCreated(taskId, token, activityRecord);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onActivityResumed(android.os.IBinder token) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder(token);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onActivityResumed, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onActivityResumed(token);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onActivityDestroyed(android.os.IBinder token) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder(token);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onActivityDestroyed, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onActivityDestroyed(token);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onFinishActivity(android.os.IBinder token) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder(token);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onFinishActivity, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onFinishActivity(token);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public top.niunaijun.blackbox.entity.am.RunningAppProcessInfo getRunningAppProcesses(java.lang.String callerPackage, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        top.niunaijun.blackbox.entity.am.RunningAppProcessInfo _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(callerPackage);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getRunningAppProcesses, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getRunningAppProcesses(callerPackage, userId);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = top.niunaijun.blackbox.entity.am.RunningAppProcessInfo.CREATOR.createFromParcel(_reply);
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
      @Override public top.niunaijun.blackbox.entity.am.RunningServiceInfo getRunningServices(java.lang.String callerPackage, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        top.niunaijun.blackbox.entity.am.RunningServiceInfo _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(callerPackage);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getRunningServices, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getRunningServices(callerPackage, userId);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = top.niunaijun.blackbox.entity.am.RunningServiceInfo.CREATOR.createFromParcel(_reply);
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
      @Override public void scheduleBroadcastReceiver(android.content.Intent intent, top.niunaijun.blackbox.entity.am.PendingResultData pendingResultData, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((intent!=null)) {
            _data.writeInt(1);
            intent.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          if ((pendingResultData!=null)) {
            _data.writeInt(1);
            pendingResultData.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_scheduleBroadcastReceiver, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().scheduleBroadcastReceiver(intent, pendingResultData, userId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void finishBroadcast(top.niunaijun.blackbox.entity.am.PendingResultData data) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((data!=null)) {
            _data.writeInt(1);
            data.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_finishBroadcast, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().finishBroadcast(data);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public java.lang.String getCallingPackage(android.os.IBinder token, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder(token);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCallingPackage, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getCallingPackage(token, userId);
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public android.content.ComponentName getCallingActivity(android.os.IBinder token, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.content.ComponentName _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder(token);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCallingActivity, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getCallingActivity(token, userId);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = android.content.ComponentName.CREATOR.createFromParcel(_reply);
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
      @Override public void getIntentSender(android.os.IBinder target, java.lang.String packageName, int uid, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder(target);
          _data.writeString(packageName);
          _data.writeInt(uid);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getIntentSender, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().getIntentSender(target, packageName, uid, userId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public java.lang.String getPackageForIntentSender(android.os.IBinder target, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder(target);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPackageForIntentSender, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPackageForIntentSender(target, userId);
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int getUidForIntentSender(android.os.IBinder target, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder(target);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getUidForIntentSender, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getUidForIntentSender(target, userId);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      public static top.niunaijun.blackbox.core.system.am.IBActivityManagerService sDefaultImpl;
    }
    static final int TRANSACTION_initProcess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_restartProcess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_startActivity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_startActivityAms = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_startActivities = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_startService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_stopService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_bindService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_unbindService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_stopServiceToken = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_onStartCommand = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_onServiceUnbind = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_onServiceDestroy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_acquireContentProviderClient = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_sendBroadcast = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_peekService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_onActivityCreated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_onActivityResumed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_onActivityDestroyed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
    static final int TRANSACTION_onFinishActivity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
    static final int TRANSACTION_getRunningAppProcesses = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
    static final int TRANSACTION_getRunningServices = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
    static final int TRANSACTION_scheduleBroadcastReceiver = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
    static final int TRANSACTION_finishBroadcast = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
    static final int TRANSACTION_getCallingPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
    static final int TRANSACTION_getCallingActivity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
    static final int TRANSACTION_getIntentSender = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
    static final int TRANSACTION_getPackageForIntentSender = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
    static final int TRANSACTION_getUidForIntentSender = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
    public static boolean setDefaultImpl(top.niunaijun.blackbox.core.system.am.IBActivityManagerService impl) {
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
    public static top.niunaijun.blackbox.core.system.am.IBActivityManagerService getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public top.niunaijun.blackbox.entity.AppConfig initProcess(java.lang.String packageName, java.lang.String processName, int userId) throws android.os.RemoteException;
  public void restartProcess(java.lang.String packageName, java.lang.String processName, int userId) throws android.os.RemoteException;
  public void startActivity(android.content.Intent intent, int userId) throws android.os.RemoteException;
  public int startActivityAms(int userId, android.content.Intent intent, java.lang.String resolvedType, android.os.IBinder resultTo, java.lang.String resultWho, int requestCode, int flags, android.os.Bundle options) throws android.os.RemoteException;
  public int startActivities(int userId, android.content.Intent[] intent, java.lang.String[] resolvedType, android.os.IBinder resultTo, android.os.Bundle options) throws android.os.RemoteException;
  public android.content.ComponentName startService(android.content.Intent intent, java.lang.String resolvedType, boolean requireForeground, int userId) throws android.os.RemoteException;
  public int stopService(android.content.Intent intent, java.lang.String resolvedType, int userId) throws android.os.RemoteException;
  public android.content.Intent bindService(android.content.Intent service, android.os.IBinder binder, java.lang.String resolvedType, int userId) throws android.os.RemoteException;
  public void unbindService(android.os.IBinder binder, int userId) throws android.os.RemoteException;
  public void stopServiceToken(android.content.ComponentName className, android.os.IBinder token, int userId) throws android.os.RemoteException;
  public void onStartCommand(android.content.Intent proxyIntent, int userId) throws android.os.RemoteException;
  public top.niunaijun.blackbox.entity.UnbindRecord onServiceUnbind(android.content.Intent proxyIntent, int userId) throws android.os.RemoteException;
  public void onServiceDestroy(android.content.Intent proxyIntent, int userId) throws android.os.RemoteException;
  public android.os.IBinder acquireContentProviderClient(android.content.pm.ProviderInfo providerInfo) throws android.os.RemoteException;
  public android.content.Intent sendBroadcast(android.content.Intent intent, java.lang.String resolvedType, int userId) throws android.os.RemoteException;
  public android.os.IBinder peekService(android.content.Intent intent, java.lang.String resolvedType, int userId) throws android.os.RemoteException;
  public void onActivityCreated(int taskId, android.os.IBinder token, android.os.IBinder activityRecord) throws android.os.RemoteException;
  public void onActivityResumed(android.os.IBinder token) throws android.os.RemoteException;
  public void onActivityDestroyed(android.os.IBinder token) throws android.os.RemoteException;
  public void onFinishActivity(android.os.IBinder token) throws android.os.RemoteException;
  public top.niunaijun.blackbox.entity.am.RunningAppProcessInfo getRunningAppProcesses(java.lang.String callerPackage, int userId) throws android.os.RemoteException;
  public top.niunaijun.blackbox.entity.am.RunningServiceInfo getRunningServices(java.lang.String callerPackage, int userId) throws android.os.RemoteException;
  public void scheduleBroadcastReceiver(android.content.Intent intent, top.niunaijun.blackbox.entity.am.PendingResultData pendingResultData, int userId) throws android.os.RemoteException;
  public void finishBroadcast(top.niunaijun.blackbox.entity.am.PendingResultData data) throws android.os.RemoteException;
  public java.lang.String getCallingPackage(android.os.IBinder token, int userId) throws android.os.RemoteException;
  public android.content.ComponentName getCallingActivity(android.os.IBinder token, int userId) throws android.os.RemoteException;
  public void getIntentSender(android.os.IBinder target, java.lang.String packageName, int uid, int userId) throws android.os.RemoteException;
  public java.lang.String getPackageForIntentSender(android.os.IBinder target, int userId) throws android.os.RemoteException;
  public int getUidForIntentSender(android.os.IBinder target, int userId) throws android.os.RemoteException;
}
