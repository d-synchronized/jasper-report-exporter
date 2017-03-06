package com.cetera.cboss.report.ds.constant;

/**
 * The Enum ExportType.
 */
public enum ExportType {

    /** The pdf. */
    PDF,

    /** The xls. */
    XLS,

    /** The csv. */
    CSV,

    /** The docx. */
    DOCX,

    /** The odt. */
    ODT,

    /** The rtf. */
    RTF,

    /** The html. */
    HTML;

    /**
     * From string.
     *
     * @param exportType
     *            the export type
     * @return the export type
     */
    public static ExportType fromString(final String exportType) {
        for (final ExportType export : ExportType.values()) {
            if (export.toString().equals(export)) {
                return export;
            }
        }
        return null;
    }

}
