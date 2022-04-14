package com.reactnative.ncdc.imagepicker;

import androidx.core.content.FileProvider;

/**
 * A custom {@code FileProvider} prevents manifest {@code <provider>} name collisions.
 */
public class NCDCImagePickerFileProvider extends FileProvider {
}