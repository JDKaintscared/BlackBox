/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package top.niunaijun.blackbox.core.system.am;
// Declare any non-default types here with import statements

public interface IBJobManagerService extends android.os.IInterface
{
  /** Default implementation for IBJobManagerService. */
  public static class Default implements top.niunaijun.blackbox.core.system.am.IBJobManagerService
  {
    @Override public android.app.job.JobInfo schedule(android.app.job.JobInfo info, int userId) throws android.os.RemoteException
    {
      return null;
    }
    @Override public top.niunaijun.blackbox.entity.JobRecord queryJobRecord(java.lang.String processName, int jobId, int userId) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void cancelAll(java.lang.String processName, int userId) throws android.os.RemoteException
    {
    }
    @Override public int cancel(java.lang.String processName, int jobId, int userId) throws android.os.RemoteException
    {
      return 0;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements top.niunaijun.blackbox.core.system.am.IBJobManagerService
  {
    private static final java.lang.String DESCRIPTOR = "top.niunaijun.blackbox.core.system.am.IBJobManagerService";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an top.niunaijun.blackbox.core.system.am.IBJobManagerService interface,
     * generating a proxy if needed.
     */
    public static top.niunaijun.blackbox.core.system.am.IBJobManagerService asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof top.niunaijun.blackbox.core.system.am.IBJobManagerService))) {
        return ((top.niunaijun.blackbox.core.system.am.IBJobManagerService)iin);
      }
      return new top.niunaijun.blackbox.core.system.am.IBJobManagerService.Stub.Proxy(obj);
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
        case TRANSACTION_schedule:
        {
          data.enforceInterface(descriptor);
          android.app.job.JobInfo _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.app.job.JobInfo.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _arg1;
          _arg1 = data.readInt();
          android.app.job.JobInfo _result = this.schedule(_arg0, _arg1);
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
        case TRANSACTION_queryJobRecord:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          top.niunaijun.blackbox.entity.JobRecord _result = this.queryJobRecord(_arg0, _arg1, _arg2);
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
        case TRANSACTION_cancelAll:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          this.cancelAll(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_cancel:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          int _result = this.cancel(_arg0, _arg1, _arg2);
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
    private static class Proxy implements top.niunaijun.blackbox.core.system.am.IBJobManagerService
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
      @Override public android.app.job.JobInfo schedule(android.app.job.JobInfo info, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.app.job.JobInfo _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((info!=null)) {
            _data.writeInt(1);
            info.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_schedule, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().schedule(info, userId);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = android.app.job.JobInfo.CREATOR.createFromParcel(_reply);
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
      @Override public top.niunaijun.blackbox.entity.JobRecord queryJobRecord(java.lang.String processName, int jobId, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        top.niunaijun.blackbox.entity.JobRecord _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(processName);
          _data.writeInt(jobId);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_queryJobRecord, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().queryJobRecord(processName, jobId, userId);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = top.niunaijun.blackbox.entity.JobRecord.CREATOR.createFromParcel(_reply);
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
      @Override public void cancelAll(java.lang.String processName, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(processName);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_cancelAll, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().cancelAll(processName, userId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public int cancel(java.lang.String processName, int jobId, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(processName);
          _data.writeInt(jobId);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_cancel, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().cancel(processName, jobId, userId);
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
      public static top.niunaijun.blackbox.core.system.am.IBJobManagerService sDefaultImpl;
    }
    static final int TRANSACTION_schedule = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_queryJobRecord = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_cancelAll = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_cancel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    public static boolean setDefaultImpl(top.niunaijun.blackbox.core.system.am.IBJobManagerService impl) {
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
    public static top.niunaijun.blackbox.core.system.am.IBJobManagerService getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public android.app.job.JobInfo schedule(android.app.job.JobInfo info, int userId) throws android.os.RemoteException;
  public top.niunaijun.blackbox.entity.JobRecord queryJobRecord(java.lang.String processName, int jobId, int userId) throws android.os.RemoteException;
  public void cancelAll(java.lang.String processName, int userId) throws android.os.RemoteException;
  public int cancel(java.lang.String processName, int jobId, int userId) throws android.os.RemoteException;
}
