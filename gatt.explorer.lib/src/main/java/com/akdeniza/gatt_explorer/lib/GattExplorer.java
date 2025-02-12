package com.akdeniza.gatt_explorer.lib;

import com.akdeniza.gatt_explorer.lib.scanner.ScanListener;
import com.akdeniza.gatt_explorer.lib.scanner.Scanner;
import com.akdeniza.gatt_explorer.lib.scanner.ScannerFactory;


/**
 * Created by Akdeniz on 04/01/2017.
 */

public class GattExplorer {

    private Scanner scanner;


    public GattExplorer() {
        scanner = ScannerFactory.getScanner();
    }

    public void onStart() {
        scanner = ScannerFactory.getScanner();

    }

    public void onStop() {

    }

    public void startScan() {
        scanner.startScan();
    }

    public void stopScan() {
        scanner.stopScan();
    }

    public void setScanResultListener(ScanListener listener) {
        scanner.setScanListener(listener);
    }

    //region "explorer part"
    public void connectToDevice() {

    }

    public void disconnectFromDevice() {

    }

    public void checkIfJsonIsAvailable() {

    }

    public void localBackup() {

    }

    public void discoverDevice() {

    }
    //endregion
}
