/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package top.niunaijun.blackbox.core.system.pm;
// Declare any non-default types here with import statements

public interface IBPackageInstallerService extends android.os.IInterface
{
  /** Default implementation for IBPackageInstallerService. */
  public static class Default implements top.niunaijun.blackbox.core.system.pm.IBPackageInstallerService
  {
    @Override public int installPackageAsUser(top.niunaijun.blackbox.core.system.pm.BPackageSettings ps, int userId) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public int uninstallPackageAsUser(top.niunaijun.blackbox.core.system.pm.BPackageSettings ps, boolean removeApp, int userId) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public int clearPackage(top.niunaijun.blackbox.core.system.pm.BPackageSettings ps, int userId) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public int updatePackage(top.niunaijun.blackbox.core.system.pm.BPackageSettings ps) throws android.os.RemoteException
    {
      return 0;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements top.niunaijun.blackbox.core.system.pm.IBPackageInstallerService
  {
    private static final java.lang.String DESCRIPTOR = "top.niunaijun.blackbox.core.system.pm.IBPackageInstallerService";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an top.niunaijun.blackbox.core.system.pm.IBPackageInstallerService interface,
     * generating a proxy if needed.
     */
    public static top.niunaijun.blackbox.core.system.pm.IBPackageInstallerService asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof top.niunaijun.blackbox.core.system.pm.IBPackageInstallerService))) {
        return ((top.niunaijun.blackbox.core.system.pm.IBPackageInstallerService)iin);
      }
      return new top.niunaijun.blackbox.core.system.pm.IBPackageInstallerService.Stub.Proxy(obj);
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
        case TRANSACTION_installPackageAsUser:
        {
          data.enforceInterface(descriptor);
          top.niunaijun.blackbox.core.system.pm.BPackageSettings _arg0;
          if ((0!=data.readInt())) {
            _arg0 = top.niunaijun.blackbox.core.system.pm.BPackageSettings.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _arg1;
          _arg1 = data.readInt();
          int _result = this.installPackageAsUser(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_uninstallPackageAsUser:
        {
          data.enforceInterface(descriptor);
          top.niunaijun.blackbox.core.system.pm.BPackageSettings _arg0;
          if ((0!=data.readInt())) {
            _arg0 = top.niunaijun.blackbox.core.system.pm.BPackageSettings.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          boolean _arg1;
          _arg1 = (0!=data.readInt());
          int _arg2;
          _arg2 = data.readInt();
          int _result = this.uninstallPackageAsUser(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_clearPackage:
        {
          data.enforceInterface(descriptor);
          top.niunaijun.blackbox.core.system.pm.BPackageSettings _arg0;
          if ((0!=data.readInt())) {
            _arg0 = top.niunaijun.blackbox.core.system.pm.BPackageSettings.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _arg1;
          _arg1 = data.readInt();
          int _result = this.clearPackage(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_updatePackage:
        {
          data.enforceInterface(descriptor);
          top.niunaijun.blackbox.core.system.pm.BPackageSettings _arg0;
          if ((0!=data.readInt())) {
            _arg0 = top.niunaijun.blackbox.core.system.pm.BPackageSettings.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.updatePackage(_arg0);
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
    private static class Proxy implements top.niunaijun.blackbox.core.system.pm.IBPackageInstallerService
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
      @Override public int installPackageAsUser(top.niunaijun.blackbox.core.system.pm.BPackageSettings ps, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((ps!=null)) {
            _data.writeInt(1);
            ps.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_installPackageAsUser, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().installPackageAsUser(ps, userId);
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
      @Override public int uninstallPackageAsUser(top.niunaijun.blackbox.core.system.pm.BPackageSettings ps, boolean removeApp, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((ps!=null)) {
            _data.writeInt(1);
            ps.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeInt(((removeApp)?(1):(0)));
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_uninstallPackageAsUser, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().uninstallPackageAsUser(ps, removeApp, userId);
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
      @Override public int clearPackage(top.niunaijun.blackbox.core.system.pm.BPackageSettings ps, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((ps!=null)) {
            _data.writeInt(1);
            ps.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_clearPackage, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().clearPackage(ps, userId);
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
      @Override public int updatePackage(top.niunaijun.blackbox.core.system.pm.BPackageSettings ps) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((ps!=null)) {
            _data.writeInt(1);
            ps.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_updatePackage, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().updatePackage(ps);
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
      public static top.niunaijun.blackbox.core.system.pm.IBPackageInstallerService sDefaultImpl;
    }
    static final int TRANSACTION_installPackageAsUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_uninstallPackageAsUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_clearPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_updatePackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    public static boolean setDefaultImpl(top.niunaijun.blackbox.core.system.pm.IBPackageInstallerService impl) {
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
    public static top.niunaijun.blackbox.core.system.pm.IBPackageInstallerService getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public int installPackageAsUser(top.niunaijun.blackbox.core.system.pm.BPackageSettings ps, int userId) throws android.os.RemoteException;
  public int uninstallPackageAsUser(top.niunaijun.blackbox.core.system.pm.BPackageSettings ps, boolean removeApp, int userId) throws android.os.RemoteException;
  public int clearPackage(top.niunaijun.blackbox.core.system.pm.BPackageSettings ps, int userId) throws android.os.RemoteException;
  public int updatePackage(top.niunaijun.blackbox.core.system.pm.BPackageSettings ps) throws android.os.RemoteException;
}
