package com.team6.leangoo.model;

import javax.persistence.*;

public class Archive {
    @Id
    @Column(name = "archive_id")
    private Integer archiveId;

    private Integer type;

    @Column(name = "project_id")
    private Integer projectId;

    @Column(name = "board_id")
    private Integer boardId;

    /**
     * @return archive_id
     */
    public Integer getArchiveId() {
        return archiveId;
    }

    /**
     * @param archiveId
     */
    public void setArchiveId(Integer archiveId) {
        this.archiveId = archiveId;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * @return project_id
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * @param projectId
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    /**
     * @return board_id
     */
    public Integer getBoardId() {
        return boardId;
    }

    /**
     * @param boardId
     */
    public void setBoardId(Integer boardId) {
        this.boardId = boardId;
    }
}