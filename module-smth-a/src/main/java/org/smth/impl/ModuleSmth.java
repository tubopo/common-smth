package org.smth.impl;

import org.smth.api.ModuleSmthApi;

/**
 * Module Smth.
 */
public class ModuleSmth implements ModuleSmthApi {

  @Override
  public void doSmth() {
    System.out.println("module-smth");
  }
}
