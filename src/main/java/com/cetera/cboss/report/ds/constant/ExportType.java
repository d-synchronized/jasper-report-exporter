package com.cetera.cboss.report.ds.constant;

/**
 * The Enum ExportType.
 */
public enum ExportType {

    /** The pdf. */
    PDF(".pdf"),

    /** The xls. */
    XLS(".xls"),

    /** The csv. */
    CSV(".csv"),

    /** The docx. */
    DOCX(".docx"),

    /** The odt. */
    ODT(".odt"),

    /** The rtf. */
    RTF(".rtf"),

    /** The html. */
    HTML(".html");

    /** The export type. */
    String exportType;

    /**
     * Instantiates a new report export type.
     *
     * @param exportType
     *            the export type
     */
    private ExportType(final String exportType) {
        this.exportType = exportType;
    }

    /**
     * Gets the export type.
     *
     * @return the export type
     */
    public String getExportType() {
        return exportType;
    }

    /**
     * Sets the export type.
     *
     * @param exportType
     *            the new export type
     */
    public void setExportType(String exportType) {
        this.exportType = exportType;
    }

    /**
     * From string.
     *
     * @param exportType
     *            the export type
     * @return the export type
     */
    public static ExportType fromString(final String exportType) {
        for (final ExportType export : ExportType.values()) {
            if (export.toString().equals(exportType)) {
                 return export;
            }
        }
        return null;
    }

}
