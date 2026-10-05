/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package top.niunaijun.blackbox.core;
public interface IBActivityThread extends android.os.IInterface
{
  /** Default implementation for IBActivityThread. */
  public static class Default implements top.niunaijun.blackbox.core.IBActivityThread
  {
    @Override public android.os.IBinder getActivityThread() throws android.os.RemoteException
    {
      return null;
    }
    @Override public void bindApplication() throws android.os.RemoteException
    {
    }
    @Override public void restartJobService(java.lang.String selfId) throws android.os.RemoteException
    {
    }
    @Override public android.os.IBinder acquireContentProviderClient(android.content.pm.ProviderInfo providerInfo) throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.os.IBinder peekService(android.content.Intent intent) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void stopService(android.content.Intent componentName) throws android.os.RemoteException
    {
    }
    @Override public void finishActivity(android.os.IBinder token) throws android.os.RemoteException
    {
    }
    @Override public void handleNewIntent(android.os.IBinder token, android.content.Intent intent) throws android.os.RemoteException
    {
    }
    @Override public void scheduleReceiver(top.niunaijun.blackbox.entity.am.ReceiverData data) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements top.niunaijun.blackbox.core.IBActivityThread
  {
    private static final java.lang.String DESCRIPTOR = "top.niunaijun.blackbox.core.IBActivityThread";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an top.niunaijun.blackbox.core.IBActivityThread interface,
     * generating a proxy if needed.
     */
    public static top.niunaijun.blackbox.core.IBActivityThread asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof top.niunaijun.blackbox.core.IBActivityThread))) {
        return ((top.niunaijun.blackbox.core.IBActivityThread)iin);
      }
      return new top.niunaijun.blackbox.core.IBActivityThread.Stub.Proxy(obj);
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
        case TRANSACTION_getActivityThread:
        {
          data.enforceInterface(descriptor);
          android.os.IBinder _result = this.getActivityThread();
          reply.writeNoException();
          reply.writeStrongBinder(_result);
          return true;
        }
        case TRANSACTION_bindApplication:
        {
          data.enforceInterface(descriptor);
          this.bindApplication();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_restartJobService:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.restartJobService(_arg0);
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
          android.os.IBinder _result = this.peekService(_arg0);
          reply.writeNoException();
          reply.writeStrongBinder(_result);
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
          this.stopService(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_finishActivity:
        {
          data.enforceInterface(descriptor);
          android.os.IBinder _arg0;
          _arg0 = data.readStrongBinder();
          this.finishActivity(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_handleNewIntent:
        {
          data.enforceInterface(descriptor);
          android.os.IBinder _arg0;
          _arg0 = data.readStrongBinder();
          android.content.Intent _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.content.Intent.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          this.handleNewIntent(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_scheduleReceiver:
        {
          data.enforceInterface(descriptor);
          top.niunaijun.blackbox.entity.am.ReceiverData _arg0;
          if ((0!=data.readInt())) {
            _arg0 = top.niunaijun.blackbox.entity.am.ReceiverData.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          this.scheduleReceiver(_arg0);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements top.niunaijun.blackbox.core.IBActivityThread
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
      @Override public android.os.IBinder getActivityThread() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.os.IBinder _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getActivityThread, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getActivityThread();
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
      @Override public void bindApplication() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_bindApplication, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().bindApplication();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void restartJobService(java.lang.String selfId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(selfId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_restartJobService, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().restartJobService(selfId);
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
      @Override public android.os.IBinder peekService(android.content.Intent intent) throws android.os.RemoteException
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
          boolean _status = mRemote.transact(Stub.TRANSACTION_peekService, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().peekService(intent);
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
      @Override public void stopService(android.content.Intent componentName) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((componentName!=null)) {
            _data.writeInt(1);
            componentName.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_stopService, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().stopService(componentName);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void finishActivity(android.os.IBinder token) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder(token);
          boolean _status = mRemote.transact(Stub.TRANSACTION_finishActivity, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().finishActivity(token);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void handleNewIntent(android.os.IBinder token, android.content.Intent intent) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder(token);
          if ((intent!=null)) {
            _data.writeInt(1);
            intent.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_handleNewIntent, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().handleNewIntent(token, intent);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void scheduleReceiver(top.niunaijun.blackbox.entity.am.ReceiverData data) throws android.os.RemoteException
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
          boolean _status = mRemote.transact(Stub.TRANSACTION_scheduleReceiver, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().scheduleReceiver(data);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static top.niunaijun.blackbox.core.IBActivityThread sDefaultImpl;
    }
    static final int TRANSACTION_getActivityThread = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_bindApplication = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_restartJobService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_acquireContentProviderClient = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_peekService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_stopService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_finishActivity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_handleNewIntent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_scheduleReceiver = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    public static boolean setDefaultImpl(top.niunaijun.blackbox.core.IBActivityThread impl) {
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
    public static top.niunaijun.blackbox.core.IBActivityThread getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public android.os.IBinder getActivityThread() throws android.os.RemoteException;
  public void bindApplication() throws android.os.RemoteException;
  public void restartJobService(java.lang.String selfId) throws android.os.RemoteException;
  public android.os.IBinder acquireContentProviderClient(android.content.pm.ProviderInfo providerInfo) throws android.os.RemoteException;
  public android.os.IBinder peekService(android.content.Intent intent) throws android.os.RemoteException;
  public void stopService(android.content.Intent componentName) throws android.os.RemoteException;
  public void finishActivity(android.os.IBinder token) throws android.os.RemoteException;
  public void handleNewIntent(android.os.IBinder token, android.content.Intent intent) throws android.os.RemoteException;
  public void scheduleReceiver(top.niunaijun.blackbox.entity.am.ReceiverData data) throws android.os.RemoteException;
}
